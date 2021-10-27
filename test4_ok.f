integer n,x,y(3),i,number
real f
write number
read n, (y(i), i=1,n) ,x
write "Squares: ", (y(i)**2, ",", i=1,99), y(100)**2
write fibonacci(n)
end

integer function z(integer number)
  if(number .eq. 3) then
       integer number
      number = 5
      z = number
  else
      z = number
  endif
end

subroutine number
  write 3
   return
end

integer function fibonacci(integer number)
    if(number .eq. 0) then
        fibonacci = 0
        return
    endif
    if(number .eq. 1) then
       fibonacci = 1
       return
    endif

    fibonacci = fibonacci(number - 1) + fibonacci(number-2)
end