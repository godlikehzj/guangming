/**
 * Created by godlikehzj on 2016/11/13.
 */
function addOrder(){
    $.ajax({
        type : "GET",
        url : "http://localhost:8086/order/toEdit.do",
        error : function() {
        },
        success : function(ret) {
            $('.right_col').html(ret);
        }
    });
}

function getOrderList(){
    $.ajax({
        type : "GET",
        url : "http://localhost:8086/order/list.do",
        error : function() {
        },
        success : function(ret) {
            $('.right_col').html(ret);
        }
    });
}

function getProductionList(){
    $.ajax({
        type : "GET",
        url : "http://localhost:8086/production/list.do",
        error : function() {
        },
        success : function(ret) {
            $('.right_col').html(ret);
        }
    });
}