<?php
// @import
require_once(__DIR__ . "/../../AbstractWorkNode.php");
require_once(__DIR__ . "/../../SQLHelper.php");

/** 宠物排行榜 */
class S100_ClearSmallPetRank extends AbstractWorkNode {
    // @Override
    function doAction($myParam) {
        // 执行 SQL 语句
        SQLHelper::executeNonQuery(
            $myParam->_sheepPDO,
            "delete from t_smallpet_rank where id in ( select human_uuid from combine_clearByHuman )"
        );
    }
}
