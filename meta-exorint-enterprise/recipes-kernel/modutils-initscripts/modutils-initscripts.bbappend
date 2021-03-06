# redefine boot order
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

PR = "r10"

python () {
    if bb.utils.contains ('MACHINE_FEATURES', 'fastboot', True, False, d):
        d.setVar('INITSCRIPT_PARAMS', "start 55 5 .")
}
#We need to restore default starting order for use custom driver
INITSCRIPT_PARAMS_us03-be15 = "start 4 S ."
INITSCRIPT_PARAMS_us03-be15c = "start 4 S ."
