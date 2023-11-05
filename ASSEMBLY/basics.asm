; THIS CODE WILL NOT RUN:
    ; files must be stored within your tasm TASM file on your c:\\ drive
    ; The TASM Program has the following Functionality:
        ; edit file.asm  -> allows you to edit your code
        ; tasm file.asm  -> converts your code into an object in the source code
        ; tlink file.obj -> converts the object file into an executable file
        ; converting your file to an object to an executable must occur everytime you make changes to the file

; to create a new file
    ; simply open TASM
    ; edit file.asm (even though it doesnt exist)
    ; and then save the file in the editor as the name you wnat it to be

; Variable TYPES:
    ; Byte (db): 8 Bit Storage
    ; Word (dw): 2 byte data item
    ; Double Word (dd): 4 byte data item
    ; Quadword (qword): 8 byte data item
    ; Paragraph (para): 16 byte data area
    ; Kilobyte: 1024 Bytes
    ; Megabyte: 1 048 576 Bytes

; Registers:
    
    ; AX: the arithmetic register, any mathematical operations are performed in here
        ; AH and AL are sub categories used in the operations, AX is the total register


; DOS Functions:
    ; AH, x contains various different function commands:
        ; each function works off of a different storage location: ie. the variable being printed must be stored in DL or whatever

    ; mov AH, 02h / 06h ->  prints out a single character (DL)
    ; mov AH, 08h       ->  gets a user input, and prints it back out 
    ; mov AH, 09h       ->  prints out a given string (DS)
    ; mov AH, 40h       ->  writes an array of bytes

; CODE:

.model small

.data                       ; All variables are stored within the .data section of the code
x db 5                      ; variable x, stored as a Byte (db), equated to 5;
y db 3
z db ?                      ; variables can be created without instantiation

.code
start: 	
    
    ; mov function:
        ; allows the user to move data from the 2nd input to the first input

    mov ax, @data		    ; moving the variables stored in .data to the ax register
	mov ds, ax			    ; the data segment DS is now pointed at AX, which has all the variables

	mov al,x			    ; AL, is a sub category of AX, meaning it can store a single mathematical operation
	add al,y			    ; add function, doesnt replace x with y, but rather combines them together
	mov z,al			    ; equating the variable z to AL, which is the combination of x and y

	mov dl,z			
	add dl, 48			    ; Adding 48 to a number, results in its ASCII equivalent of the original number [7 + 48 = ASCII value for 7]
	
    mov ah,09h              ; prints the given string (converted to string by the ASCII conversion)

	int 21h				    ; calls the previously called DOS function
	int 27h				    ; ends the program

	end
