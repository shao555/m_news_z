$(document).ready(function () {

    $.get({url:"cate",dataType:'json',success:cate});
    //id选择器  失去焦点事件
    $("#select").blur(checkSelect);
    $("#title").blur(function () {
            var title = $("#title").val();
            if (title == null || title == "") {
                alert("标题不能为空");
                return false;
            }
            $.post({url: "check.do", data: "title=" + title, success: callback});
            function callback(data) {
                if (data == "true") {
                    alert("新闻标题已存在,请重新输入");
                } else {
                    alert("新闻标题可用");
                }
            }
        }
    );
    $("#mytab").submit(function () {
        if (!checkSelect() || !checkTitle()) {
            return false;
        } else {
            alert("修改成功");
            return true;
        }

    });

    function cate(data2) {
        var $select = $("#select");
        for (var i = 0; i <data2.length ; i++) {
            $select.append("<option value='"+data2[i].id+"'>"+data2[i].name+"</option>");
        }
    }
});

function ba() {
    history.back();
}


function checkSelect() {
    var select = $("#select").val();
    if (select == null || select == "" || select == "0") {
        alert("分类不能为空");
        return false;
    }
    return true;
}
