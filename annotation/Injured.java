public @interface Injured{
    String veterinarian()  default "nao registrado";
    String value() default "comida";
    int age() default 1;
}