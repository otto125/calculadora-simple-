Funcion resultado <- Suma(operandoUno, operandoDos)
	
	Definir resultado Como Real
	
	
	resultado <- operandoUno + operandoDos
	
FinFuncion

Funcion Resta
	
	Definir operandoUno, operandoDos, resultado Como Real
	
	Leer operandoUno
	Leer operandoDos
	
	resultado <- operandoUno - operandoDos
	
	Escribir resultado
FinFuncion
	
funcion resultado <- multiplicar(operandoUno, operandoDos)
	
	Definir resultado Como Real
	
	
	resultado <- operandoUno * operandoDos
	
FinFuncion


funcion resultado <- dividir(operandoUno, operandoDos)
	
	Definir resultado Como Real
	
	
	resultado <- operandoUno / operandoDos
	
FinFuncion

Algoritmo calculadora
	
	Definir operacion Como Entero
	Definir numeroUno, numeroDos Como Real
	
	Leer operacion
	Leer numeroUno
	Leer numeroDos
	
	Segun operacion Hacer
		1: operacion <- Suma(numeroUno, numeroDos)
		2: Resta
		//3: operacion <- dividir(numeroUno, numeroDos)
		4: operacion <- dividir(numeroUno, numeroDos)
		5: operacion <- multiplicar(numeroUno,numeroDos)
			
			Escribir "resultado " , operacion;
	FinSegun
	
FinAlgoritmo