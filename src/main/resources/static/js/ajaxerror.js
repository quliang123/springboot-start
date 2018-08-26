/**
 * Created by 123 on 2018/08/24.
 */
$.ajax({
    url: "/err/getAjaxerror",
    type: "POST",
    async: false,
    success: function(data) {
        debugger;
        if(data.status == 200 && data.msg == "OK") {
            alert("success");
        } else {
            alert("发生异常：" + data.msg);
        }
    },
    error: function (response, ajaxOptions, thrownError) {
        debugger;
        alert("error");
    }
});