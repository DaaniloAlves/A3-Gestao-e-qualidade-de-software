����   Ac
      automatizacaobeedoo/Metodos <init> ()V	  	 
   automatizacaobeedoo/Main deuCerto Z  'org/openqa/selenium/chrome/ChromeDriver
    ,org/openqa/selenium/support/ui/WebDriverWait       
      java/time/Duration 	ofSeconds (J)Ljava/time/Duration;
     6(Lorg/openqa/selenium/WebDriver;Ljava/time/Duration;)V     ! " org/openqa/selenium/WebDriver manage )()Lorg/openqa/selenium/WebDriver$Options; $ % & ' ( %org/openqa/selenium/WebDriver$Options window (()Lorg/openqa/selenium/WebDriver$Window; * + , -  $org/openqa/selenium/WebDriver$Window maximize / https://altio.beedoo.io/login  1 2 3 get (Ljava/lang/String;)V 5 
inputLogin
 7 8 9 : ; org/openqa/selenium/By id ,(Ljava/lang/String;)Lorg/openqa/selenium/By;  = > ? findElement :(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/WebElement; A java/lang/CharSequence C D E F G org/openqa/selenium/WebElement sendKeys ([Ljava/lang/CharSequence;)V I inputPassword K btn
 7 M N ; 	className C P Q  click      �
 U V W X Y java/lang/Thread sleep (J)V [ R//div[contains(@class, 'alert bs-callout bs-callout-danger fade in alert_beebot')]
  ] ^ _ existeXPATH 4(Ljava/lang/String;Lorg/openqa/selenium/WebDriver;)Z  a b  quit
 d e f g  javax/swing/JFrame show	 i j k l m java/lang/System out Ljava/io/PrintStream; o Login ou senha inválidos
 q r s t 3 java/io/PrintStream println v Usuário ou senha inválidos x Aviso
 z { | } ~ javax/swing/JOptionPane showMessageDialog <(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V � Logado com sucesso!      ' � ://div[contains(@class, 'box-content list-required-posts')]   � � � makeConcatWithConstants (Z)Ljava/lang/String; � 	post-item  � � � findElements *(Lorg/openqa/selenium/By;)Ljava/util/List; � � � � � java/util/List iterator ()Ljava/util/Iterator; � � � � � java/util/Iterator hasNext ()Z � � � � next ()Ljava/lang/Object;      � � &//button[contains(@class, 'btn-gray')]
 7 � � ; xpath � � � � size ()I  � � � (I)Ljava/lang/String; � Botao encontrado! � 3org/openqa/selenium/ElementNotInteractableException � $org/openqa/selenium/TimeoutException � Procurando btn-gray correto...      � � fa-shopping-cart
 � � � � � 1org/openqa/selenium/support/ui/ExpectedConditions elementToBeClickable L(Lorg/openqa/selenium/By;)Lorg/openqa/selenium/support/ui/ExpectedCondition;
  � � � until 1(Ljava/util/function/Function;)Ljava/lang/Object; � java/util/ArrayList
 � 
 � � � � � java/lang/String hashCode � 	comCordao
 � � � � equals (Ljava/lang/Object;)Z � 	semCordao � product_20431
 � � � � add  � � ,Array vazio, 'string acao' teve valor errado
 � � � � valueOf &(Ljava/lang/Object;)Ljava/lang/String;  � � � &(Ljava/lang/String;)Ljava/lang/String;
  � � � addCarrinho K(Ljava/util/ArrayList;Lorg/openqa/selenium/WebDriver;)Ljava/util/ArrayList;  �
 � �
 � � 2 � (I)Ljava/lang/Object;
 � � � � T(Lorg/openqa/selenium/WebElement;)Lorg/openqa/selenium/support/ui/ExpectedCondition; � addCart � close      �
  � � � comprarCarrinho P(Lorg/openqa/selenium/WebDriver;Lorg/openqa/selenium/support/ui/WebDriverWait;)V	  � � � produtosComprados Ljava/util/ArrayList;  �      �  � java/lang/NullPointerException TENTANDO DE NOVO 6org/openqa/selenium/remote/UnreachableBrowserException )org/openqa/selenium/NoSuchWindowException
 	
 � getDeuCerto *Navegador fechado
Interrompendo o programa *org/openqa/selenium/NoSuchSessionException .org/openqa/selenium/SessionNotCreatedException Exception detectada 	Signature )Ljava/util/ArrayList<Ljava/lang/String;>; Code LineNumberTable LocalVariableTable this Lautomatizacaobeedoo/Main; automatizacaoBeedoo M(Ljavax/swing/JFrame;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V e (Lorg/openqa/selenium/WebDriverException; 
listaItems Ljava/util/List; itr Ljava/util/Iterator; btnGray 
btnGrayItr btnGrayEncontrado pd Ljava/lang/String; i I  Ljava/lang/NullPointerException; popupInicial itensDesejados produtosFinais 
loginCerto a driver Lorg/openqa/selenium/WebDriver; espera .Lorg/openqa/selenium/support/ui/WebDriverWait; ee 0Lorg/openqa/selenium/SessionNotCreatedException; jf Ljavax/swing/JFrame; login senha acao LocalVariableTypeTable 2Ljava/util/List<Lorg/openqa/selenium/WebElement;>; 6Ljava/util/Iterator<Lorg/openqa/selenium/WebElement;>; StackMapTable? &org/openqa/selenium/WebDriverException 
ExceptionsB java/lang/InterruptedException <clinit> 
SourceFile 	Main.java BootstrapMethodsH Existe o popup inicial: J  botoes 'btn-gray' encontrados: L 	product_N Produtos desejados: P 91 ou mais produtos disponiveis!
 Produtos selecionados: R 2Produtos comprados: . Automatização concluída!T =Compra(s) efetuada(s)!
Os id's dos produtos comprados são: V
WXY �Z $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses Options Window_ %java/lang/invoke/MethodHandles$Lookupa java/lang/invoke/MethodHandles Lookup !           	 � �            /     *� �                    	
 �          � �          " 	   �    U� Y� :� Y � � :�  � # � ) .� 0 4� 6� < � @Y+S� B H� 6� < � @Y,S� B J� L� < � O  R� TZ� \� � 6� "� ` *� c� hn� p*uw� y�k� h� p �� T�� \6� h� �  � p� ��� L� � :� � :		� � � 	� � � C� O ��� �� T�� �� � :

� � :� h
� � � �  � p6� � � C� O � h�� p6� :� h�� p��� �� T�� L� �� �� C� O  �� T� �Y� �:-:	6
	� ƫ     8   �B�   +_��-   	˶ ͙ 6
� 	Ѷ ͙ 6

�   S                $Ӷ �W� :Y�6]\� "Z� � �  :� �W���ܧ � hٶ p� h� ۺ �  � p� �:	� h� � ۺ �  � p6

	� �d� W	
� �� Ǹ 6� < � � �� C� O � 6� �� �� C� O � L� �� �� C� O �
��� � T� �	� �� h	� ۺ �  � p�  �� T� ` *� �� ۺ �  w� y� :
� h� p� ��� %:� ` *� c�� *w� y� :� :*w� y� @Z] �@Z] �d  + # + # + C  EH   B P   ) 	 ,  - + 2 4 5 M 6 f 7 w 9 } < � = � > � ? � @ � A � D � G � J � K � N � Q � R � S � T X [" \+ ]= ^@ aO bW cZ f] d_ eg gl kr n� q� t� v� y� | } ~ % |+ �. �6 �F �O �d �s �� �� �� �� �� �� �� �� �� �� �� � � � � �  �# �% �, �0 �6 �@ �C �E �H �J �T �   � _   � �  � z ! 	" J" 
+ A#! @ ,$   %&  ''( g `'( 
 	) 
 �Q*  ��+ � O �, � 	 ��-  % .  	</0  +12 J 
34   U56    U7&   U8&   U9& :   >  � �;  � z < 	" J"; 
+ A#< ��+ O �, 	=   � � +  � _@� %� ? � �� 1 � �\>	�   d � � �    � O � �
�  � � � 0 �� _� G � 
  d � � �    H>B� B@    A C           � �           D   EF   , U GU IU KU MU OU QU S[     $ \	 * ]	^`b 