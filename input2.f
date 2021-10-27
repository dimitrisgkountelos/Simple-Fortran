common /C1/x,z,i,w
integer
x(10,100,2),z(2),i,j,N
real a(5), list al logical ll,yy(10) complex k,w(20)
string s,s_str_(10)
data x/2000/,z/2,-9/,N/0x3FC70/
data a/.314159e-31,.2e-30,0O.272/,ll/.false./,yy/.false.,.true.,.true./
data w/7*(5.:20.),6*(4.:-2.),7*(0.3:0.)/
data s_str_/"string1", *"string2", "string3"/
$ no comment
100 yy(z) = .not. ll .and. .not. x(10,i,g(j)).gt.y(z) .or. z .eq. 0B11
call aa
1000 if (b(i,j+k) .and. (x(i,j,g(i+j)) .gt. re(a(k**i)))) stop
10 continue
al = new(9.)
cdddr(al) = [.6e-10,2.1e-17]s = "ssh"
do i=1,x(10,g(y(i*j)+j),1),3
integer i1,j1,k1,m(100) complex u
200 read (m(i1),((x(i1,j1,k1),i1=1,x(i,j,2)),j1=1,100),k1=1,N,2*m(i1)),z
if (yy(i)) goto 1000
u = -(1.:-3.2)
if (a.gt.0B.01.and.b(0,a*k**i).and.g(m(i)).lt.x(i,i+2,g(j))) then
integer z,a(10)
101 read z,a(z)
105 if (z .gt. 0 .and. z .le. 6) goto z,(100,101,102,103,104,105)
else
integer i logical l(1000)
do i=1,N,2
1000 l(i) = x(i,g(i),g(j)).le.im(u)
enddo
endif
102 call try_me_(x(i,int(ll),z),m,car(al))
103 if (y(g(y(z-2)))+a) 100,1000,10
104 yy(m(i*j)) = .not. x(i,j,z) .ge. i
enddo $ 1000 $
a = cdr(a)
re(u) = -2.1
end
subroutine try_me_(integer n,a(n), logical l)
    integer i
        do i=1,n
            if (l .and. a(i) .gt. 0) a(i) = a(i) - i
        enddo
return
end
real function y(integer n)
integer i,j
if (n .gt. 0) then y = n
else
j=0
do i=1,n+1,n/2
j = j+i
enddo
y=j
endif
return
end
integer function g(integer i)
g = i**5
return
end
integer function int(logical l)
if (l) then int = 1 else int = 0 endif
stop
end
subroutine www
write "Hello!"
return
end
subroutine aa
call www
end
integer function a(complex z)
common /C1/x,y,k
integer x(2000),y(3)
complex k(20)
integer i
read i
a=0
if (b(i,z)) if (i) 100,200,100
100 return
200 write z
a=1
end
logical function b(integer n, complex c)
b = .false.
if (n.eq.0x100) b = .true.
end