n,v,h=gets.chomp.split.map(&:to_i)
print([v,n-v].max*[h,n-h].max*4) 