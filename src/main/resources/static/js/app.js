var ciudad;



app2 = (function () {
    var nameCiudad;

    function obtenerClima (ciudadObj) {
        alert("Encontro ciudad"); 
        ciudad = ciudadObj;
        llenarTabla();
    }

    return {
        setCiudadName: function () { 
            nameCiudad = document.getElementById("txt_ciudad").value;
        },
        
        buscarCiudad: function () {     
            alert("entro");      
            app2.setCiudadName();
            appClient2.getCiudadByName(nameCiudad, app2.obtenerClima);
        }
    };
})();