/*
Напишите программу, которая принимает на вход цифру, обозначающую день недели, 
и проверяет, является ли этот день выходным.

6 -> да
7 -> да
1 -> нет
*/

Console.Clear();

Console.WriteLine("Введите число");
int a = Convert.ToInt32(Console.ReadLine());
if(Math.Abs(a)<6)
{
    Console.WriteLine("Будни :(");
}
else
{
Console.WriteLine("Выходной :D");
}