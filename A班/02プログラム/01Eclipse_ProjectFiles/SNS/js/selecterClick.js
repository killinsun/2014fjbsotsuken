/* onMouseDownイベント発生した時 */
function pMouseDown(id, obj) {
	obj.src="./img/style/plused.gif";
}

/* onMouseUpイベントが発生した時 */
function pMouseUp(id, obj) {
	obj.src="./img/style/plus.gif";

	document.getElementById('uid').value = id;
	document.getElementById('pid').value = "0";
	document.getElementById('form').action = "/SNS/SearchServlet";
	document.getElementById('form').submit();
}

/* onMouseDownイベント発生した時 */
function mMouseDown(id, obj) {
	obj.src="./img/style/minused.gif";
}

/* onMouseUpイベントが発生した時 */
function mMouseUp(id, obj) {
	obj.src="./img/style/minus.gif";

	document.getElementById('uid').value = id;
	document.getElementById('pid').value = "2";
	document.getElementById('form').action = "/SNS/SearchServlet";
	document.getElementById('form').submit();
}