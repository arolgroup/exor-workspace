SUMMARY = "Userspace framebuffer boot logo based on usplash."
DESCRIPTION = "PSplash is a userspace graphical boot splash screen for mainly embedded Linux devices supporting a 16bpp or 32bpp framebuffer. It has few dependencies (just libc), supports basic images and text and handles rotation. Its visual look is configurable by basic source changes. Also included is a 'client' command utility for sending information to psplash such as boot progress information."
HOMEPAGE = "http://git.yoctoproject.org/cgit/cgit.cgi/psplash"
SECTION = "base"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://psplash.h;beginline=1;endline=16;md5=840fb2356b10a85bed78dd09dc7745c6"

PR = "r24"
SRCNAME = "ltools-${BPN}"
SRCREV = "99d3dab523dba86b16c6925db2342b532a5d3022"

SRCBRANCH_ca16 = "pgd_ca"
SRCREV_ca16 = "736e9a64604f1bfc56e1cd3015390105491b6da2"

inherit exorint-src

inherit autotools
inherit pkgconfig
#inherit update-rc.d

B = "${S}"

do_install_append() {
	install -d ${D}/mnt/.psplash/
	install -d ${D}/mnt/.splashimage/
}

FILES_${PN} += "/mnt/.psplash"
FILES_${PN} += "/mnt/.splashimage"
