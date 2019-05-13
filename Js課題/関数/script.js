document.write("<p>問1</p>");

function menseki(hankei, en) {
	return ("の円の面積は" + (hankei * hankei * en * 3.14) + "です。");
}

document.write("半径5cm");
document.write(menseki(5, 1));
document.write("<br>半径7cm");
document.write(menseki(7, 1));
document.write("<br>半径10cm")
document.write(menseki(10, 1));

document.write("<p>問2</p>");

function ryoukin(otona, kodomo) {
	return ("グループの合計金額は") + (otona * 500 + kodomo * 200) + ("円です。");
}

document.write("A");
document.write(ryoukin(2, 4));
document.write("<br>B");
document.write(ryoukin(1, 5));
document.write("<br>C");
document.write(ryoukin(3, 7));