# AnnotationProcessingSample
Annotation Processing Tool 을 이용한 Android Library 만들어 보기

## annotations
Annotation Processor 가 이용할 Annotation 들이 들어있는 모듈
이번 예제에서는 Factory annotation 만 이용합니다

## compiler
Annotation Processor 가 들어있는 모듈
이번 예제에서 사용하는 Factory annotation 을 이용해서 Code Generation 을 합니다
Code Generation 에는 JavaPoet 을 이용합니다

## library
Annotation Processor 에서 생성한 코드들을 접근하는 모듈
생성된 코드를 Reflection 을 이용해 접근하는 코드를 작성합니다
이번 예제에서는 안다룹니다.
예를 들면 ButterKnife.bind() 가 이 모듈에 해당합니다

## app
Sample Android Application
Factory annotation 이 달려있는 다양한 모델이 들어있습니다.
이번 예제에는 CalzonePizza, MargheritaPizza, Tiramisu 가 이용됩니다
