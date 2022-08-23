### Exercício [Map](https://docs.oracle.com/javase/10/docs/api/java/util/Map.html) de fixação



#### É uma coleção de pares chave / valor
>• Não admite repetições do objeto chave.

>• Os elementos são indexados pelo objeto chave (não possuem posição).

>• Acesso, inserção e remoção de elementos são rápidos.

#### Principais implementações:
>• HashMap - mais rápido (operações O(1) em tabela hash) e não ordenado

>• TreeMap - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo
compareTo do objeto (ou Comparator)

>• LinkedHashMap - velocidade intermediária e elementos na ordem em que são adicionados



#### Alguns métodos importantes
>• put(key, value), remove(key), containsKey(key), get(key)

>• Baseado em equals e hashCode

>• Se equals e hashCode não existir, é usada comparação de ponteiros

>• clear()

>• size()

>• keySet() - retorna um Set<K>

>• values() - retornaa um Collection<V>
