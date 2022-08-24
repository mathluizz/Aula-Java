## Interfaces Funcionais: 
É uma interface que possui um único método abstrato. Suas
implementações serão tratadas como expressões lambda.


### [Predicate](https://docs.oracle.com/javase/10/docs/api/java/util/function/Predicate.html)
  >public interface Predicate<T> {
  boolean test (T t);
  }
  
  •removeIf(Predicate)
  
### [Consumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html) 
  >public interface Consumer<T> {
  void accept(T t);
  }
  
  • foreach(Consumer)
  
### [Function](https://docs.oracle.com/javase/10/docs/api/java/util/function/Function.html)
  >public interface Function<T, R> {
  R apply(T t);
  }
  
  • map(Function)

  ## [Stream](https://www.oracle.com/br/technical-resources/articles/java-stream-api.html)
  • É uma sequencia de elementos advinda de uma fonte de dados que
oferece suporte a "operações agregadas".
  
### Operações intermediárias
> •filter
• map
• flatmap
• peek
• distinct
• sorted
• skip
• limit (*)

### Operações terminais
>• forEach
• forEachOrdered
• toArray
• reduce
• collect
• min
• max
• count
• anyMatch (*)
• allMatch (*)
• noneMatch (*)
• findFirst (*)
• findAny (*)  
