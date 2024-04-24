//var idade = window.confirm("Você é maior de 18 anos");

/*
if (window.confirm("Deseja continuar?")) {
    alert("Você escolheu OK!");
    var imagem = documen.getElementById(a2)
    imagem.src = "img/a1.png"; // Substitua pelo caminho da sua imagem
    document.body.appendChild(imagem);
} else {
    alert("Você escolheu Cancelar!");
    var imagem = documen.querySelector(img.a2)
    imagem.src = "img/man.jpg"; // Substitua pelo caminho da sua imagem
    document.body.appendChild(imagem);
}
*/

function exibirImagem() {
    if (window.confirm("Deseja exibir uma imagem?")) {
        // Se o usuário escolher "OK", exibe a imagem "imagemOK"
        document.getElementById("I1").style.display = "block";
        document.getElementById("I2").style.display = "none";
    } else {
        // Se o usuário escolher "Cancelar", exibe a imagem "imagemCancelar"
        document.getElementById("I1").style.display = "none";
        document.getElementById("I2").style.display = "block";
    }
}

