function func() {
  var x = document.getElementById('name').value;
  numx = parseInt(x);
  numx = numx + 1;
  document.getElementById('answer').innerHTML = numx;
}