����   < Z
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V
      rectanglearea/RectangleArea 	getLength (Ljava/util/Scanner;)D
     getWidth
     getArea (DD)D
    ! " displayData (DDD)V	 
 $ % & out Ljava/io/PrintStream; ( #Enter the length of the rectangle: 
 * + , - . java/io/PrintStream println (Ljava/lang/String;)V
  0 1 2 
nextDouble ()D 4 "Enter the width of the rectangle:    6 7 8 makeConcatWithConstants (DDDD)Ljava/lang/String; Code LineNumberTable LocalVariableTable this Lrectanglearea/RectangleArea; main ([Ljava/lang/String;)V args [Ljava/lang/String; sc Ljava/util/Scanner; length D width area MethodParameters 
SourceFile RectangleArea.java BootstrapMethods M
 N O P 7 Q $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; S ( x  = 
The area of the rectangle is  InnerClasses V %java/lang/invoke/MethodHandles$Lookup X java/lang/invoke/MethodHandles Lookup !            9   /     *� �    :        ;        < =   	 > ?  9   �     '� Y� 	� L+� I+� 9(� 9(� �    :       
         &  ;   4    ' @ A     B C    D E    F E   	 G E  H    @   	    9   ;     � #'� )*� /�    :   
       ;        B C   H    B   	    9   ;     � #3� )*� /�    :   
       ;        B C   H    B   	    9   J     &(k9�    :   
        ;         D E      F E    G E  H   	 D   F   	 ! "  9   T 	    � #&(� 5  � )�    :   
    %  & ;         D E      F E     G E  H    D   F   G    I    J K     L  R T   
  U W Y 