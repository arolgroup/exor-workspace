FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://e2fsck.conf \
	file://e2fsck-print-problem-codes.patch"

do_install () {
	oe_runmake 'DESTDIR=${D}' install
	oe_runmake 'DESTDIR=${D}' install-libs
	# We use blkid from util-linux now so remove from here
	rm -f ${D}${base_libdir}/libblkid*
	rm -rf ${D}${includedir}/blkid
	rm -f ${D}${base_libdir}/pkgconfig/blkid.pc
	rm -f ${D}${base_sbindir}/blkid
	rm -f ${D}${base_sbindir}/findfs

	install -m 644 ${WORKDIR}/e2fsck.conf ${D}${sysconfdir}/
}

FILES_e2fsprogs-e2fsck = "${base_sbindir}/e2fsck ${base_sbindir}/fsck.ext* ${base_sbindir}/fsck"
