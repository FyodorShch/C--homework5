/*
Напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет.

645 -> 5

78 -> третьей цифры нет

32679 -> 6
*/

Console.Clear();

Console.Write("Введите число: ");
int a = Convert.ToInt32(Console.ReadLine());
if (a < 1000 && a > 99)
{
    Console.WriteLine($"Третья цифра -> {a % 10}");
}
if (a > 999)
{
    while (a / 100 > 9)
    {
        a /= 10;
    }
    Console.WriteLine($"Третья цифра -> {a % 10}");
}
if (a < 100)
{
    Console.WriteLine("Третьей цифры нет");
}