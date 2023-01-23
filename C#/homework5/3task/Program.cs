/* Задайте массив вещественных чисел. Найдите разницу между максимальным и минимальным элементов массива.

[3 7 22 2 78] -> 76 */

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

void MinAndMaxSearch(int[] array)
{
    int min = array[0];
    int max = array[0];
    for (int j = 0; j < array.Length; j++)
    {
        if (array[j] < min)
        {
            min = array[j];
        }
        if (array[j] > max)
        {
            max = array[j];
        }
    }
    Console.WriteLine($"Максималный элемент массива — {max}, минмальный — {min}");
    Console.WriteLine($"Разница между максимальным и минимальным элементом массива равна {max - min}");
}

int Size = int.Parse(Console.ReadLine());
int Min = int.Parse(Console.ReadLine());
int Max = int.Parse(Console.ReadLine());
int[] mass = CreateRandomArray(Size, Min, Max);
ShowArray(mass);
MinAndMaxSearch(mass);