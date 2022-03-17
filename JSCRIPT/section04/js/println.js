/*
// println(title, value)
*/
function println(title, value) {
    document.write(title, value, '<br>');
}

function printlist() { // 가변 파라미터
    for(var cnt=0; cnt < arguments.length; cnt++) {
        document.write(arguments[cnt]);
    }
    document.write('<br>');
}