Streams divided into functional interfaces 
# 1. predicate - return boolean
# 2. Function - maps and returns updated values
# 3. Consumer - returns void
# 4. BinaryOperator - returns function

## Predicate - returns boolean - functional interface accepts int and return boolean
```
Predicate<int> isEven = new Predicate<int>();
{
  @override
  public boolean test(int x){
      return x%2==0;
  }
}
```

## Function - maps and returns updated values - functional interface accepts int and return int
```
Function<int,int> square = new Function<int,int>();
{
  @override
  public int sqr(int x){
      return x*x;
  }
}
```

## Consumer - returns void - functional interface accepts int and return void
```
Consumer<int> square = new Consumer<int>();
{
  @override
  public int print(int x){
      System.out.println(x);
  }
}
```
### Use case - 
Create a method that divides even numbers, odd numbers abd multiples of 3 in a list
```
private static void functionMade(List<int>num, Predicate<Int>pred){
    num.stream.filter(pred).forEach(System.out::println);
}
public static void main(){
  functionMade(num, x-> x%2==0);
  functionMade(num, x-> x%2==1);
  functionMade(num, x-> x%3==0);
```
