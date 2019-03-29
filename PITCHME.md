---
#Design Patterns

+++

@css[text-bold text-25 text-smallcaps](Proxy) is a Conceptual design pattern that provides an object that acts as a substitute for a real service object used by a client. Proxy receives client requests, does some work (access control, caching, etc.) and then passes request to a service object.


---?code=doc/assets/scratch_proxy.java&lang=java&title=Proxy

+++

@css[text-bold text-25 text-smallcaps](Lazy Loading) is a design pattern commonly used in computer programming to defer initialization of an object until the point at which it is needed.

---?code=doc/assets/scratch_lazy_loading.java&lang=java&title=Lazy Loading

Every call to the object will first check to see if it has been loaded/initialized, and if it hasn’t, it gets loaded/initialized. 