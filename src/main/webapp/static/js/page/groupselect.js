/**
 *  创建一条申请消息
 * @param b
 */
function createMe(b){
	var id = $(b).parent().prev().prev().children().eq(0).text()

	$.ajax({
		type:"post",
		url:"/OnlineLeaveOnYouth/message/"+id+"/createMessage",
		success:function(result){
			if(result == 1){
				alert("申请成功")
			}else {
				alert("申请失败");
			}
		}
	})
}