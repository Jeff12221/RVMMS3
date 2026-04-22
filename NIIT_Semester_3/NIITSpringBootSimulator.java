{\rtf1\ansi\ansicpg1252\cocoartf2709
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww28600\viewh18000\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 Import java.util.scanner\
\
Public class NIITSpringBootSimulator \{\
\
	public static void main (String [] args) throws InterruptedException \{\
		Scanner scanner = new Scanner(system.in);\
		\
		System.out.println(\'93=============================\'93);\
		System.out.println(\'93SPRING  BOOT  BACKEND  SIMULATOR (SEM 3)\'94);\
		System.out.println(\'93==============================\'93);\
		System.out.println(\'93Goal: Build and Run your first REST API.\\n\'94);\
\
		// The \'93Contract\'94 of the lesson\
		String[] steps = \{\
			\'93Download project from start.spring.io with \'91Spring Web\'92 \'93,\
			\'93Annote your class to make it a web Controller\'94,\
			\'93Define the url path for your hello message\'94,\
			\'93Run the application and check the browser\'94\
	\};\
	\
	String [] keyAnswers = \{\
		\'93generate\'94,\
		\'93@RestController\'94,\
		\'93@GetMapping\'94,\
		\'93localhost:8080\'94\
	\};\
\
	for (int i = 0;  i < steps.length; i++) \{\
		boolean correct = false;\
\
		while (!correct) \{\
			System.out.println(\'93\\n[TASK\'94 + (i + 1) + \'93]: \'94+ steps [i]);\
			System.out.print(\'93Enter code/keyword: \'93);\
			String input = scanner.nextLine();\
\
			//Validation (ignores case for better student experience)\
			if (input.trim().equalsIgnoreCase(keyAnswers[i])) \{\
				System.out.print(\'93Compiling&Initialising\'94);\
\
				//The \'93\'85\'94 Animation logic \
				for (int dots = 0; dots <4; dots++) \{\
					Thread.sleep(600);\
					System.out.print(\'93.\'94);\
				\}\
\
				System.out.println(\'93\\n\uc0\u9745  BEAN CREATED SUCCESSFULLY!\'94)\
				correct = true;\
			\} else \{\
				System.out.println(\'93\uc0\u65336 ERROR: Unexpected input. Check your spelling!\'94);\
				System.out.println(\'93HINT: You are looking for: \'93+ keyAnswers[i]);\
			\}\
		\}\
	\}\
	\
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0
\cf0 	System.out.println("\\n==========================================");\
        	System.out.println("\uc0\u55356 \u57225  API IS LIVE! YOUR BACKEND IS READY!");\
        	System.out.println("JSON Sent to Frontend: \{\\"message\\": \\"Hello NIIT\\"\}");\
        	System.out.println("==========================================");\
        \
        	scanner.close();\
	 \}\
\}}