package edu.upc.eetac.dsa.yifeige.Ejercicio1_constuctores;


public class Arbol 
{
	public Arbol(int n)
	{
	    System.out.printf("un árbol de %d metros\n", n);
	}
	public Arbol(String s)
	{
		System.out.printf("Un %s",s);
	}
	public Arbol()
	{
		System.out.println("un árbol genérico");
	}
	
	public Arbol(int n,String s)
	{
		System.out.printf("Un %s de %d metros",s,n);
	}

}
