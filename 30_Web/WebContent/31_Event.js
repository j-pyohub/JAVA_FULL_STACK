//표수정

var multiplication = function(){
	let start = numberList[0].value;
	let end = numberList[1].value;
	
	let message = "";
	
		if(end>=start){
		for (var j = start; j <= end; j++) {
			message += "<div>";
			for (var i = 1; i <= 9; i++){
				message += "<span>" + j + "*" + i + "=" +  i * j +"  </span>";
			}
			message += "</div>";
			} 
	} else {
		message = "두번째숫자는 첫번째숫자보다 크거나 같음";
	} output(message);
}

var output = function(message){
	document.querySelector("h3").innerHTML = "<br>" + message;}