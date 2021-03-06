<?php
// @import
require_once(__DIR__ . "/../../AbstractWorkNode.php");
require_once(__DIR__ . "/../../SQLHelper.php");

/** 宠物 */
class S100_ClearSmallPet extends AbstractWorkNode {
    // @Override
    function doAction($myParam) {
        // 执行 SQL 语句
        SQLHelper::executeNonQuery(
            $myParam->_sheepPDO,
            "delete from t_small_pet where humanUUId in ( select human_uuid from combine_clearByHuman )"
        );
    }
}
