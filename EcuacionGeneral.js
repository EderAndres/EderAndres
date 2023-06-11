function solveQuadraticEquation(a, b, c) {
    let discriminant = b * b - 4 * a * c;
  
    if (discriminant < 0) {
      // No hay soluciones reales
      return null;
    } else if (discriminant === 0) {
      // Hay una solución real
      let x = -b / (2 * a);
      return [x];
    } else {
      // Hay dos soluciones reales
      let x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
      let x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
      return [x1, x2];
    }
  }
  
  // Ejemplo de uso
  let a = 1;
  let b = -3;
  let c = 2;
  
  let solutions = solveQuadraticEquation(a, b, c);
  
  if (solutions === null) {
    console.log('La ecuación no tiene soluciones reales.');
  } else if (solutions.length === 1) {
    console.log('La ecuación tiene una solución real: x = ' + solutions[0]);
  } else {
    console.log('La ecuación tiene dos soluciones reales: x1 = ' + solutions[0] + ', x2 = ' + solutions[1]);
  }