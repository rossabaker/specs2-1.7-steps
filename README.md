specs2-1.6.1:

    >>> start
    <<< start
    >>> e1
    >>> e2
    >>> e3
    <<< e1
    <<< e2
    <<< e3
    >>> stop
    <<< stop
    [info] This is a specification of the order of steps
    [info]  
    [info] The server must be running in
    [info] + the first test
    [info] + the second test
    [info] + the third test
    [info]  
    [info] Total for specification ServerSpec
    [info] Finished in 6 seconds, 8 ms
    [info] 3 examples, 0 failure, 0 error
    [info] Passed: : Total 3, Failed 0, Errors 0, Passed 3, Skipped 0

specs2-1.7:

    >>> start
    <<< start
    >>> e1
    >>> stop
    <<< stop
    <<< e1
    >>> e3
    <<< e3
    >>> e2
    <<< e2
    [info] ServerSpec
    [info] 
    [info] This is a specification of the order of steps
    [info]  
    [info] The server must be running in
    [error] x the first test
    [error]     the value is false (spec.scala:24)
    [error] x the second test
    [error]     the value is false (spec.scala:24)
    [error] x the third test
    [error]     the value is false (spec.scala:24)
    [info]  
    [info] Total for specification ServerSpec
    [info] Finished in 11 seconds, 31 ms
    [info] 3 examples, 3 failures, 0 error
    [info] 
    [error] Failed: : Total 3, Failed 3, Errors 0, Passed 0, Skipped 0
    [error] Failed tests:
    [error]     ServerSpec
    [error] {file:/home/ross/src/specs2-1.7-steps/}default-a06236/test:test: Tests unsuccessful
    [error] Total time: 8 s, completed Dec 28, 2011 8:57:10 PM

