// Obtén referencias a los elementos HTML 
let btnCrearCuenta = document.querySelector("#btn-crearCuenta");
let iniciarSesionHTML = document.querySelector("#iniciarSesion");
let btnIniciarSesion = document.querySelector("#btn-iniciarSesion");
let crearCuentaHTML = document.querySelector("#crearCuenta");

btnCrearCuenta.addEventListener("click", () => {
    iniciarSesionHTML.classList.add("hiddens_opciones");
    crearCuentaHTML.classList.remove("hiddens_opciones");
});

btnIniciarSesion.addEventListener("click", () => {
    crearCuentaHTML.classList.add("hiddens_opciones");
    iniciarSesionHTML.classList.remove("hiddens_opciones");
});