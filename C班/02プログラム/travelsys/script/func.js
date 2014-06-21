function setData(txt)
{
	var count1 = txt.indexOf("1.");
	var count2 = txt.indexOf("2.");
	var count3 = txt.indexOf("3.");
	var count4 = txt.indexOf("4.");
	var count5 = txt.indexOf("5.");
	var count6 = txt.indexOf("6.");

	var coment = txt.substring(0,count1);
	var img = txt.substring(count1+3,count2);
	var checkS = txt.substring(count2+3,count3-1);
	var checkE = txt.substring(count3+3,count4-1);
	var fee = txt.substring(count4+2,count5-1);
	var date = txt.substring(count5+2,count6-1);

	var i = Number(fee);
	var n = Number(date);
	var sum = i * n + 5880;



	document.getElementById("coment").innerHTML = coment;
	document.getElementById("img").innerHTML = "<img src ='./images/"+img+"' >";
	document.getElementById("check").innerHTML= "チェックイン "+'<input type="time" min="'+checkS+'" max="'+checkE+'" value="'+checkS+'" >';
	document.getElementById("fee").innerHTML = fee+"円";
	document.getElementById("date").innerHTML = date+"泊";
	document.getElementById("sum").innerHTML = sum +"円";





}