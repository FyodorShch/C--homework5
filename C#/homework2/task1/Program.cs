/*
Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает 
вторую цифру этого числа.

456 -> 5
782 -> 8
918 -> 1
*/

Console.Clear();

Console.Write("Введите число: ");
int a = Convert.ToInt32(Console.ReadLine());
if (a < 1000)
{
    int b = (a / 10) % 10;
    Console.WriteLine($"Вторая цифра числа {a} — {b}");
}
else
{
    Console.WriteLine("Введите правильное число");
}