package ejercicios.clases.wrappers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte datoByte = 2; //byte primitivo
		Byte datoByteWrapper = 3;//Byte Wrapper
		System.out.println("byte primitivo: " + datoByte);
		System.out.println("Byte Wrapper: " + datoByteWrapper);
		//Conversion de byte a Byte
		byte datoByte1 = 6;
		Byte datoConvertido = datoByte1;
		System.out.println("Byte convertido: " + datoConvertido);
		//Conversion de Byte a byte
		Byte datoConvertido2 = 6;
		byte datoByte2 = datoConvertido2.byteValue();
		System.out.println("byte convertido " + datoByte2);
		System.out.println(" ");
		
		short datoShort = 1; //short primitivo
		Short datoShortWrapper = 1; //Short Wrapper
		System.out.println("short primitivo: " + datoShort);
		System.out.println("Short Wrapper: " + datoShortWrapper);
		//Conversion de short a Short
		short datoShort1 = 4;
		Short shortConvertido = datoShort1;
		System.out.println("Short convertido: " + shortConvertido);
		//Conversion de Short a short
		Short shortConvertido2 = 1;
		short datoShort2 = shortConvertido2.shortValue();
		System.out.println("short convertido: " + datoShort2);
		System.out.println(" ");
		
		int edad = 45; //int primitivo
		Integer edadWrapper = 48; //Integer Wrapper
		System.out.println("int primitivo: " + edad);
		System.out.println("Integer Wrapper: " + edadWrapper);
		//Conversion de int a Integer
		int edad1 = 45;
		Integer integerConvertido = edad1;
		System.out.println("Integer convertido: " + integerConvertido);
		//Conversion de Integer a int
		Integer integerConvertido2 = 78;
		int edad2 = integerConvertido2.intValue();
		System.out.println("int convertido: " + edad2);
		System.out.println(" ");
		
		long valorGrande = 125344; //long primitivo
		Long valorGrandeWrapper = 123123L; //Long Wrapper
		System.out.println("long primitivo: " + valorGrande);
		System.out.println("Long Wrapper: " + valorGrandeWrapper);
		//Conversion de long a Long
		long valorGrande1 = 789412L;
		Long valorGrandeWrapper1 = valorGrande1;
		System.out.println("Long convertido: " + valorGrandeWrapper1);
		//Conversionde Long a long
		Long valorGrandeWrapper2 = 4589644L;
		long valorGrande2 = valorGrandeWrapper2.longValue();
		System.out.println("long convertido: " + valorGrande2);
		System.out.println(" ");
		
		boolean interrogracion = false; //boolean primitivo
		Boolean interrogacionWrapper = true; //Boolean Wrapper
		System.out.println("boolean primitivo: " + interrogracion);
		System.out.println("Boolean Wrapper: " + interrogacionWrapper);
		//Conversion de boolean a Boolean
		boolean interrogacion1 = true;
		Boolean interrogacionWrapper1 = interrogacion1;
		System.out.println("Boolean convertido: " + interrogacionWrapper1);
		//Conversion de Boolean a boolean
		Boolean interrogacionWrapper2 = false;
		boolean interrogacion2 = interrogacionWrapper2.booleanValue();
		System.out.println("boolean convertido: " + interrogacion2);
		System.out.println(" ");
		
		float flotante = 4.568f; //float primitivo
		Float flotanteWrapper = 78.448f; //Float Wrapper
		System.out.println("float primitivo: " + flotante);
		System.out.println("Float Wrapper: " + flotanteWrapper);
		//Conversion de float a Float
		float flotante1 = 14.456f;
		Float flotanteWrapper1 = flotante1;
		System.out.println("Float convertido: " + flotanteWrapper1);
		//Conversion de Float a float
		Float flotanteWrapper2 = 13.456f;
		float flotante2 = flotanteWrapper2.floatValue();
		System.out.println("float convertido: " + flotante2);
		System.out.println(" ");
		
		double doblado = 78.45; //double primitivo
		Double dobladoWrapper = 12.45; //Double Wrapper
		System.out.println("double primitivo: " + doblado);
		System.out.println("Double Wrapper: " + dobladoWrapper);
		//Conversion de double a Double
		double doblado1 = 49.456;
		Double dobladoWrapper1 = doblado1;
		System.out.println("Double convertido: " + dobladoWrapper1);
		//Conversion de Double a double
		Double dobladoWrapper2 = 78.32;
		double doblado2 = dobladoWrapper2.doubleValue();
		System.out.println("double convertido: " + doblado2);
		System.out.println(" ");
		
		char chara = 'a'; //char primitivo
		Character charaWrapper = 'e'; //Character Wrapper
		System.out.println("char primitivo: " + chara);
		System.out.println("Character Wrapper: " + charaWrapper);
		//Conversion de char a Character
		char chara1 = 'z';
		Character charaWrapper1 = chara1;
		System.out.println("Character convertido: " + charaWrapper1);
		//Conversion de Character a char
		Character charaWrapper2 = 'f';
		char chara2 = charaWrapper2.charValue();
		System.out.println("char convertido: " + chara2);
		
	}

}
