d=int(input())
if (d%4==0):
	if (d%100==0):
		if (d%400==0):
			print ("yes")
		else:
			print ("no")
	else:
		print ("yes")
else:
	print("no")
