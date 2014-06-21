function setChiiki(kenName){
	var chiiki;

	if(kenName == "北海道"){
		chiiki = "北海道";
	}else if(kenName == "青森" || kenName == "岩手" || kenName == "宮城" || kenName == "秋田" || kenName == "山形" || kenName == "福島"){
		chiiki = "東北";
	}else if(kenName == "茨城" || kenName == "栃木" || kenName == "群馬"){
		chiiki = "北関東";
	}else if(kenName == "東京" || kenName == "埼玉" || kenName == "千葉" || kenName == "神奈川"){
		chiiki = "首都圏";
	}else if(kenName == "山梨" || kenName == "長野" || kenName == "新潟"){
		chiiki = "甲信越";
	}else if(kenName == "富山" || kenName == "石川" || kenName == "福井"){
		chiiki = "北陸";
	}else if(kenName == "大阪" || kenName == "京都" || kenName == "兵庫" || kenName == "奈良" || kenName == "滋賀" || kenName == "和歌山"){
		chiiki = "近畿";
	}else if(kenName == "愛知" || kenName == "岐阜" || kenName == "三重" || kenName == "静岡"){
		chiiki = "東海";
	}else if(kenName == "岡山" || kenName == "広島" || kenName == "山口" || kenName == "鳥取" || kenName == "島根"){
		chiiki = "山陰・山陽";
	}else if(kenName == "香川" || kenName == "愛媛" || kenName == "高知" || kenName == "徳島"){
		chiiki = "四国";
	}else if(kenName == "福岡" || kenName == "佐賀" || kenName == "長崎" || kenName == "大分" || kenName == "熊本" || kenName == "宮城" || kenName == "鹿児島"){
		chiiki = "九州";
	}else if(kenName == "沖縄"){
		chiiki = "沖縄";
	}

	document.getElementById("chiiki").value = chiiki;
}