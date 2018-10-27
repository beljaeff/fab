###Example factory for building acceptor objects
There is a back frontend app intended for creating and combing
queries for some backend services. So app has a service layer for working
with third-party services. All third-party services accessible from app via 
client libraries (plugged jar's) and configuring by acceptors (from another 
jar).<br />
So before making request to any backend service appropriate acceptor object 
have to be created. This small app presents example factory for building
such acceptors.