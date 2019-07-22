/* 6. Los resultamos de las últimas elecciones a alcalde en el pueblo Santa Fe han sido los siguientes:
Distrito    Candidatos
            A     B     C     D
1          194   48    206    45
2          180   20    320    16
3          221   90    140    20
4          432   50    821    14
5          820   61    946    18
Escribir un programa que haga las siguiente tareas:
a) Imprimir la tabla anterior con cabeceras incluidas.
b) Calcular e imprimir el número total de votos recibidos por cada candidato y el porcentaje del total de votos emitimos.
Asimismo, visualizar el candidato más votado.
c) Si algún candidato recibe más de 50% de los datos, el programa imprimirá un mensaje declarándole ganador.
d) Si ningún candidato recibe más de 50% de los datos, el programa debe imprimir el nombre de los dos candidatos más votados,
que serán los que pasen a la segunda ronda de las elecciones. */
import java.util.Random;
public class EleccionesArreglos
{
	public static void main(String[] args)
	{
		Random numerosAleatorios = new Random();
		int[][] matriz = new int[6][5];
		String[][] orden = new String [1][5];
		int sumaTotal=0,sumaA,sumaB,sumaC,sumaD,PorcentajeA,PorcentajeB,PorcentajeC,PorcentajeD;
			orden[0][0] = "";
			orden[0][1] = "A";
			orden[0][2] = "B";
			orden[0][3] = "C";
			orden[0][4] = "D";


								for (int i = 0;i<orden.length;i++)
							{
								for(int j = 0; j<orden[0].length;j++)
								{
									System.out.print("      "+orden[i][j]);
								}
							}



								for (int i = 1;i<matriz.length;i++)
							{
								System.out.printf("%n %d ",i);

								for (int j = 1;j<matriz[0].length;j++)
								{
									matriz[i][j] = numerosAleatorios.nextInt(1000)+1;
									System.out.print(" 	"+matriz[i][j]);
									sumaTotal += matriz[i][j];
								}
								System.out.println("\n");
							}
						System.out.printf("El total de votos es %d %n",sumaTotal);




			sumaA= matriz[1][1]+matriz[2][1]+matriz[3][1]+matriz[4][1]+matriz[5][1];
				PorcentajeA=((sumaA*100)/sumaTotal);
			sumaB= matriz[1][2]+matriz[2][2]+matriz[3][2]+matriz[4][2]+matriz[5][2];
				PorcentajeB=((sumaB*100)/sumaTotal);
			sumaC= matriz[1][3]+matriz[2][3]+matriz[3][3]+matriz[4][3]+matriz[5][3];
				PorcentajeC=((sumaC*100)/sumaTotal);
			sumaD= matriz[1][4]+matriz[2][4]+matriz[3][4]+matriz[4][4]+matriz[5][4];
				PorcentajeD=((sumaD*100)/sumaTotal);



System.out.printf(" %n Votos y porcentaje de cada candidato : %n A %d %d %% %n B %d %d %% %n C %d %d %% %n D %d %d %% %n ", sumaA,PorcentajeA,sumaB,PorcentajeB,sumaC,PorcentajeC,sumaD,PorcentajeD);


							if ((sumaA>sumaB)&&(sumaA>sumaC)&&(sumaA>sumaD))

								System.out.printf("El candidato con más votos es el A %n");

						    	else if ((sumaB>sumaA)&&(sumaB>sumaC)&&(sumaB>sumaD))

										System.out.printf("El candidato con más votos es el B %n");

									else if ((sumaC>sumaA)&&(sumaC>sumaD)&&(sumaC>sumaB))

										System.out.printf("El candidato con más votos es el C %n");

										else
						   					 System.out.printf("El candidato con más votos es el D %n");


								if	((sumaA >= (sumaTotal/2))|| (sumaB >= (sumaTotal/2)) || (sumaC >= (sumaTotal/2)) || (sumaB >= (sumaTotal/2)))
								{
											if (sumaA >= (sumaTotal/2))
												System.out.printf("El candidato A es el GANADOR por tener más de la mitad de los votos");

											if (sumaB >= (sumaTotal/2))
												System.out.printf("El candidato B es el GANADOR por tener más de la mitad de los votos");

										    if (sumaC >= (sumaTotal/2))
												System.out.printf("El candidato C es el GANADOR por tener más de la mitad de los votos");

				  		   	        		 if (sumaB >= (sumaTotal/2))
												System.out.printf("El candidato B es el GANADOR por tener más de la mitad de los votos");

								}

								else

								{
											if ((sumaA>sumaB)&&(sumaA>sumaC)&&(sumaA>sumaD))
											{
												if ((sumaB>sumaC)&&(sumaB>sumaD))
												{
												System.out.printf("Los candidatos A y B pasan a la siguiente ronda de elecciones :) %n");
												} else if ((sumaC>sumaB)&&(sumaC>sumaD))
												{
													System.out.printf("Los candidatos A y C pasan a la siguiente ronda de elecciones :) %n");
												}
												 else
												{
													System.out.printf("Los candidatos A y D pasan a la siguiente ronda de elecciones :) %n");
												}
											}

											if ((sumaB>sumaA)&&(sumaB>sumaC)&&(sumaB>sumaD))
											{
												if ((sumaA>sumaC)&&(sumaA>sumaD))
												{
												System.out.printf("Los candidatos B y A pasan a la siguiente ronda de elecciones :) %n");
												} else if ((sumaC>sumaB)&&(sumaC>sumaD))
												{
													System.out.printf("Los candidatos B y C pasan a la siguiente ronda de elecciones :) %n");
												}
												else
												{
													System.out.printf("Los candidatos B y D pasan a la siguiente ronda de elecciones :) %n");
												}
											}

											if ((sumaC>sumaB)&&(sumaC>sumaA)&&(sumaC>sumaD))
												{
												if ((sumaB>sumaA)&&(sumaB>sumaD))
												{
													System.out.printf("Los candidatos C y B pasan a la siguiente ronda de elecciones :) %n");
												} else if ((sumaA>sumaB)&&(sumaA>sumaD))
												{
													System.out.printf("Los candidatos C y A pasan a la siguiente ronda de elecciones :) %n");
												}
												else
												{
													System.out.printf("Los candidatos C y D pasan a la siguiente ronda de elecciones :) %n");
												}
											}

											if ((sumaD>sumaB)&&(sumaD>sumaC)&&(sumaD>sumaA))
											{
												if ((sumaB>sumaC)&&(sumaB>sumaA))
												{
												System.out.printf("Los candidatos D y B pasan a la siguiente ronda de elecciones :) %n");
												} else if ((sumaC>sumaB)&&(sumaC>sumaA))
												{
													System.out.printf("Los candidatos D y C pasan a la siguiente ronda de elecciones :) %n");
												}
												else
												{
													System.out.printf("Los candidatos D y A pasan a la siguiente ronda de elecciones :) %n");
												}
											}
								}
	}
}
/*
C:\Users\User\Documents\ITESM\Progra>java Ej6Arreglos2
            A      B      C      D
 1      628     913     995     676


 2      486     663     497     951


 3      662     580     92      447


 4      973     694     487     639


 5      371     380     233     252

El total de votos es 11619

 Votos y porcentaje de cada candidato :
 A 3120 26 %
 B 3230 27 %
 C 2304 19 %
 D 2965 25 %
 El candidato con más votos es el B
Los candidatos B y A pasan a la siguiente ronda de elecciones :)
*/


