����   A �
      java/lang/Object <init> ()V
  	 
   org/openqa/selenium/By xpath ,(Ljava/lang/String;)Lorg/openqa/selenium/By;      org/openqa/selenium/WebDriver findElement :(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/WebElement;  *org/openqa/selenium/NoSuchElementException
     id  java/util/ArrayList
  
     iterator ()Ljava/util/Iterator;   ! " # $ java/util/Iterator hasNext ()Z   & ' ( next ()Ljava/lang/Object; * java/lang/String
 , - . / 0 automatizacaobeedoo/Metodos existeID 4(Ljava/lang/String;Lorg/openqa/selenium/WebDriver;)Z
  2 3 4 add (Ljava/lang/Object;)Z 6 https://altio.beedoo.io/store  8 9 : getCurrentUrl ()Ljava/lang/String;
 ) < = 4 equals      :�
 A B C D E java/lang/Thread sleep (J)V	 G H I J K java/lang/System out Ljava/io/PrintStream; M atualizando...
 O P Q R S java/io/PrintStream println (Ljava/lang/String;)V  U V W navigate ,()Lorg/openqa/selenium/WebDriver$Navigation; Y Z [ \  (org/openqa/selenium/WebDriver$Navigation refresh ^ Meu carrinho
  ` a  linkText
 c d e f g 1org/openqa/selenium/support/ui/ExpectedConditions elementToBeClickable L(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/support/ui/ExpectedCondition;
 i j k l m ,org/openqa/selenium/support/ui/WebDriverWait until 1(Ljava/util/function/Function;)Ljava/lang/Object; o org/openqa/selenium/WebElement n q r  click      � v )//button[contains(@class, 'btn-success')]  x y z findElements *(Lorg/openqa/selenium/By;)Ljava/util/List; |  } java/util/List |  � � size ()I   � � � makeConcatWithConstants (I)Ljava/lang/String; � Botao encontrado! � 3org/openqa/selenium/ElementNotInteractableException � $org/openqa/selenium/TimeoutException � !Procurando btn-success correto... � "Procurando btn-success2 correto... Code LineNumberTable LocalVariableTable this Lautomatizacaobeedoo/Metodos; existeXPATH e ,Lorg/openqa/selenium/NoSuchElementException; st Ljava/lang/String; driver Lorg/openqa/selenium/WebDriver; StackMapTable addCarrinho K(Ljava/util/ArrayList;Lorg/openqa/selenium/WebDriver;)Ljava/util/ArrayList; lista Ljava/util/Iterator; url Ljava/util/ArrayList; produtosAdicionados comprou Z produtoDisponivel LocalVariableTypeTable (Ljava/util/Iterator<Ljava/lang/String;>; )Ljava/util/ArrayList<Ljava/lang/String;>; 
Exceptions � java/lang/InterruptedException 	Signature _(Ljava/util/ArrayList<Ljava/lang/String;>;Lorg/openqa/selenium/WebDriver;)Ljava/util/ArrayList; comprarCarrinho P(Lorg/openqa/selenium/WebDriver;Lorg/openqa/selenium/support/ui/WebDriverWait;)V (Lorg/openqa/selenium/WebDriverException; wait .Lorg/openqa/selenium/support/ui/WebDriverWait; 
btnSuccess Ljava/util/List; btnSuccessItr btnSuccessEncontrado btnSuccess2 btnSuccess2Itr btnSuccess2Encontrado 2Ljava/util/List<Lorg/openqa/selenium/WebElement;>; 6Ljava/util/Iterator<Lorg/openqa/selenium/WebElement;>; � &org/openqa/selenium/WebDriverException 
SourceFile Metodos.java BootstrapMethods � #botoes 'btn-success' encontrados:  �
 � � � � � $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses 
Navigation � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup ! ,           �   /     *� �    �        �        � �   	 � 0  �   n     +*� �  W�M�        �              �        � �     � �      � �  �    M  	 / 0  �   n     +*� �  W�M�        �       "  #  $  % �        � �     � �      � �  �    M  	 � �  �  �     �� Y� M>6� r*� :�  � *� % � ):+� +� ,� 1W6� :���5:+� 7 � ;� 6>�  >� @� FL� N+� T � X ���� ,��  . A D   �   f    ,  . 
 /  1  2  4 " 5 . 7 7 8 > 9 A < D ; F = I ? M @ [ A ^ B ` D e E k F s G ~ I � J � K � M �   R  .  ' �   f � �  M 1 � �    � � �     � � �   � � �  
 � � �   } � �  �       f � �    � � �    � � �  �   ) 
�  � 
  � ( )B � �  )�  �     � �    � 	 � �  �  (  	   �+]� _� b� h� n� p  s� @*u� � w M,� { N� F,� ~ � �  � N6-� % � n� p � F�� N6� :� F�� N��� s� @*u� � w :� { :� F� ~ � �  � N6� % � n� p � F�� N6� :� F�� N��ױ  A Z ] � A Z ] � � � � � � � � �  �   j    U  W  Y & Z - [ > \ A _ O ` W a Z d ] b _ c g e l g r i  j � k � l � o � p � q � t � r � s � u � v �   f 
 _  � �  �  � �    � � �     � � �  & � � �  - � � �  A � � �   K � �  � B � �  � - � �  �   *  & � � �  - � � �   K � �  � B � �  �     � A |  [ �	� 5 |  \ �	 �     �  �    � �     �  � �     Y  �	 � � � 