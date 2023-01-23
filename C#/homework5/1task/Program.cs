/* Задайте массив заполненный случайными положительными трёхзначными числами. Напишите программу,
которая покажет количество чётных чисел в массиве.

[345, 897, 568, 234] -> 2 */

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
void CheckArray(int[] array)
{
    int k = 0;
    for (int j = 0; j < array.Length; j++)
    {
        if (array[j] % 2 == 0)
        {
            k++;
        }
    }
    Console.WriteLine($"Количество чётных элементов в массиве равно {k}");
}

int Size = int.Parse(Console.ReadLine());
int Min = int.Parse(Console.ReadLine());
int Max = int.Parse(Console.ReadLine());
int[] mass = CreateRandomArray(Size, Min, Max);
ShowArray(mass);
CheckArray(mass);