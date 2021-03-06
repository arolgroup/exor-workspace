require xscreensaver.inc
PR = "${INC_PR}.3"

SRC_URI = "http://www.jwz.org/xscreensaver/xscreensaver-${PV}.tar.gz \
           file://configure.in.patch \
           file://fix_minixpm_compile.patch \
           file://glfix.patch \
           file://initFile.patch \
           file://remote.patch \
           file://deactivate_on_release.patch \
           file://disable_screen_blank.patch \
           file://run_as_admin.patch \
           file://new_freeze_command_blocks_user.patch \
           file://XScreenSaver"

SRC_URI[md5sum] = "55a12fcb5d3a7231c9850ef9d9f82918"
SRC_URI[sha256sum] = "8c50a74c07b1fffcbb20bd79e3ee92f1f52191e5a187433bb49964ccf94badb6"
