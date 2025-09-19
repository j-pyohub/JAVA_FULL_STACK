var actionReset = function(){
	location.href = location.href;
}

var optionNum = function(startNum, selector, title){	
	let options = "<option>"+title+"</option>";
	for ( i = startNum; i < 10; i++) {
		options += "<option>" + i + "</option>";
	}
	selector.innerHTML = options;
}

var multiplicationTable = function(num1, num2){
	let result = "";
	for(j = 1; j<10; j++){
		result += "<div>"
		for (i = num1; i <= num2; i++){
			result += "<span>" + i + " * " + j + " = " + i*j + " </span>";
		}
		result += "</div>";
	}
	return result;
}