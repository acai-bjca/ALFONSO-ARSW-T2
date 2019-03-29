var ciudad;
app2 = (function () {
    var nameCiudad;

    return {
        setCiudadName: function () { 
            nameCiudad = document.getElementById("txt_ciudad").value;
        },

        obtenerClima: function (ciudadObj) {
            alert("Encontro ciudad"); 
            ciudad = ciudadObj;
            llenarTabla();
        },

        buscarCiudad: function () {     
            alert("entro");      
            app2.setCiudadName();
            appClient.getCiudadByName(nameCiudad, appClient.obtenerClima);
        }
    };
})();