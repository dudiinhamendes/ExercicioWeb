const form = document.getElementById('formLogin');
const usuario = document.getElementById('usuario');
const senha = document.getElementById('senha');

form.addEventListener('submit', function (event) {
    event.preventDefault();

    if (usuario.value === '' || senha.value === '') {
        alert('É obrigatório preencher todos os campos.');
    }
    else {
        alert('Login realizado com sucesso!');
    }

});
