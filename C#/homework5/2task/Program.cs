/* Задайте одномерный массив, заполненный случайными числами. 
Найдите сумму элементов, стоящих на нечётных позициях.

[3, 7, 23, 12] -> 19

[-4, -6, 89, 6] -> 0 */

Console.Clear();

int[] CreateRandomArray(int size, int min, int max)
{
    int[] array = new int[size];
    for (int i = 0; i < size; i++)
    {
        array[i] = new Random().Next(min, max + 1);
    }
    return array;
}

void ShowArray(int[] array)
{

    for (int i = 0; i < array.Length; i++)
    {
        Console.Write(array[i] + " ");
    }
    Console.WriteLine();
}

void SummOfNechetNumber(int[] array)
{
    int s = 0;
    for (int j = 0; j < array.Length; j++)
    {
        if (j % 2 != 0)
        {
            s += array[j];
        }
    }
    Console.WriteLine($"сумма элеметов на нечётных позициях равна {s}");
}

int Size = int.Parse(Console.ReadLine());
int Min = int.Parse(Console.ReadLine());
int Max = int.Parse(Console.ReadLine());
int[] mass = CreateRandomArray(Size, Min, Max);
ShowArray(mass);
SummOfNechetNumber(mass);