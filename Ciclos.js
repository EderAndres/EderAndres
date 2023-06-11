function generarSalida() {
    let numero = 1;
    let incremento = 1;
  
    for (let i = 0; i < 12; i++) {
      console.log(numero);
      numero += incremento;
      incremento++;
    }
  }
  
  generarSalida();