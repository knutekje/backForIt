Backend for hotel reservation system

[Entities]
Days
All days, to help with logic of room occupancy

Roomoccupancy
Day + room boolean if occupied

Room
All rooms in the hotel

Price
Unique with relation to day and room
Price of room at current day

Guest
Guests staying at hotel. Not related to users
One guests can have multiple stays without registering, each with unique occurences. 

Boooking 
Unique 
related to room and guest