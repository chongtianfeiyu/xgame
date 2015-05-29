<?php
// @import
require_once(__DIR__ . "/../AbstractWorkNode.php");
require_once(__DIR__ . "/../CombineHelper.php");

/** 功能开启 */
class S100_CombineFunction extends AbstractWorkNode {
    // @Override
    function doAction($myParam) {
        CombineHelper::combine(
            "t_funciton", null, $myParam->_sheepPDO, $myParam->_wolfPDO
        );
    }
}
