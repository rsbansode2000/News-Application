package com.news_api.news_application.testing;

import java.util.List;

import com.news_api.news_application.entity.News;

public class TestApp {
    private int id = 1;
    private int clicks = 1;
    private String newsHeading = "C proposes expert panel to inspect closed Vedanta group plant in Tamil Nadu";
    private String timing = "FEBRUARY 14, 2024 20:41 IST";
    private String writer = "By Rohit";
    private String image = "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAoHCBUVEhgSFRUYGBgZGhoaGBkZGB0YGRoYHBkZGRkYGBgcJC4lHB4rHxgYJjgmKy8xNTU1GiQ7QDs0Py40NTEBDAwMEA8QHxISHzEnJCs0NDQ0NDQ9MTQ0NDQ1NDQ0NDQ0NDE0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NDQ0NP/AABEIAKgBLAMBIgACEQEDEQH/xAAbAAACAwEBAQAAAAAAAAAAAAAAAQIEBQMGB//EAEMQAAIBAwIDBQUGAwUHBQEAAAECEQADIQQSBTFBBhMiUWEycYGRoUJSscHR8BQjYhVygpLxBxYzg5PC4UNUZKKyJP/EABkBAQEBAQEBAAAAAAAAAAAAAAABAgMEBf/EACcRAAICAgICAgEEAwAAAAAAAAABAhEDEiExQVEToWEiMpGxBHGB/9oADAMBAAIRAxEAPwD35FEVOiK7nAjTFOKYFAEUwKAKcUAhToinFAFFEUwKAUUVKKcUAhTiiKcUAopxTAphaAUUwKlFAFC0IiiKmRSigoUURTiigCiigg0A4oFAp0KFFFFQBToooApGnRQCpRTooBUU4pbaAKVSoihSjFFOKIq2ZFTFOiKWAFOiKYFCBRTinQtCpxRRNAOKYFKalNBQRRQKdLFABTAomiaFHTAqM0waAkRSinNFAKinFFQBRFMU6AjQKcUUAUU6IoAooinQoqKKKAVAFOnUBGnTiilgVKpUqFKVIinRVMiFSpU6AYqQpCnQBRRUooBRSqcVGKAQqVEURQo6KAKcUIFEURTilgUUxTigClgcU6cUUsBRTiipZaFRTp0sURpxTopYFFOKKdSwKKdFFCiop0qCgopUUFBTpUxQBSp0UBQooooKHTFIUxQUMU6YpigI1OlToWgooooShiigURQUOnSFMUFDFAop0FBTFKmKCiZ5VyS4reywPuIP4VbsqCM5muotKBAAHuEfhWduTWvspUV1u29vurnWrJQqKdFCBRRRQtBTooigoKKKKEFRRRQCooooAp1GadAOilToaKFFInp8vXrWJ2k402mQOApGJ3T1ZVEQRHMn4VLFG7UhXhtL26JbY9tCZiUue6IBUg8/vdDyr2Gg1QuJvClfQxPIHoT50sUy1RQKKlgnRSp1bAUxSopYHRRRQADUqVOgHRSmiaAlVLiutFq2XIkkgAAiTNXK8/2o0lvYt42wXDoN3I7QdxBPliM+dSTpGoR2kkTsdqAAB/LHo15QflFXLfalD9qz8LynPwrw2g0gVrBgE2t3PAfeWPi8o3fSrdjs+psPZLRucPuAkg7Su3pPOvO5JeT3vDa/av5PeWeKLc8IiTkbWDCu1eYscFtNdd3UEO4fbkbYTYFBBmJANekRQAAOQwPcMV1hK0ePLBRfVE5p1GaddLOQ6KVFLA6KU0TQDmilNE0sDpGiaU0sDopTSmlgTN4gPQ/lH51KuTnK+/8A7TQ99F9plHvIH41LCR1miaqNxK0OdxB72AHzOKBxGyc98n+df1paLq/RkNxH/wCLZ/6ifpUf7SB56Wz/ANS3WL/uxaz4B9a86+nQa0aTuVgtG6TMQW5fA150m/J7rxrij3q8RH/trI/5lur+m14Kgfw6+uxlP/5zXmF7L2fuD61Z/wBzbBAOyD5inJJPG/H9m7avqLhZu+CkYUqCFOOsT59etXFv2TyugejD/SvB8P4eH1F3T231CG0YJW6wU8ogA+taOs0GptW2f+LubUUs25VuYAk+0CTiqnJGHGD5PYLbn2WVvc35UzZbyPwg/nXhU1OoWwNSbtlrZAO57O0wTtGEgjJFWrnENRbKBktS5hArvbLGJgAk5q7sy8S9nrSCOYI94IpA1521xy+CVNp5UAkLdRyPKQygirFvtIx9q3d97WlYfNXn6Vr5CfC/DNyiste0Vk4YR/y7qf8AbH1qVzi2ncbe82HzW6ob5N+lX5EZeGXo0hTrguotOCFZsgwRLR6ypIrqWUCd64+8dp+ooppmXjkiVFcf4hPvp/nX9aR1C/eT/Ov61dkZ0fo7zXntbxW+Lr6aLTLtBzbYgqec/wAzmPd8uVahvNuEPb29fGs8xy+E/SqWpthnPit+KSP5izGPX1rE5ccHow41f6jV4RZtlZNtAYHJRz9MVfsW0YFgq82HIdCR+Vea/hWGAygelwD86LemcYDCMn/iDmTJ5N5mue34Ok8SbtSLuv4jscm3sVV3biULHwoWJG1hIxEfGrOjvO9tXcKGYTCggCemSaxv4ByTyIiI7xTnM9fKtnSoyoqmJA+8vn763CXPPBjLjioqnbO4NOag0gezPoCufmYpKWPNCPip/Bq67I8urOk0TVfU6kIJafQY/MxWQ3HVAfe6IfsS6GOftEH3dKjkjSxyZvzSmvNf7xoBAdTgZAe5nrG1eVVH4+8zvunlhbCqPm4psi/Cz2E0TXh73alh9/8AxPaT8DNZ9/tOx+5H9V9rg+SyKbD4pH0Z3CiWIA9TH41WfiNof+oh9zBj8lmvmjcfb7LWl/u2bh+pUCq78busY726fRLKAf8A2aabF+L8n01+MWxy3n3Iw+rACq97jkKWFpsCfEyrPxG6vmb8QuMY3alvTeE+gmoOhjcbBMZJe6zY+AFTYqxo92e0u9ZYWUhuTOLnLzA2+dXOFmw9vcb1sGSPCuMAf1GvnWlV2ylqwQMZVn/Fo+lbWlfWbYRdOAOndAZ+ArMuTpFRXlnrddwa1eBX+M2oRDIoTawmfFuk/IiuvBuEWdPbNtNQjAsWkhZkwPP0rx2p1urRS7ppoHMm3XKzxq+wnZpP+mf1rKvwVqL8s96ADNUv7Fsd73/djvAZ35mYj864dn+NbyUYAtjzjk0ZJ/pPSsuzqXPGkQO4tvLFCTtxab7MxEgGilZmj2On0+4+nWtu2PCB6VWQAchVpeQrUTlIoaXhNm3cuXlSHumbhkncQAJgkgcukV212gS7ba0wgMrKYwYYQYrG7N6p3v6vfcZlW8yIpiEVcQsCtTjV0rprrKxVgjEMOamMMJ8q1wTkrajs/afSjSeIWwEAIjdCsGGSOsZx1rpquCo72XMjuWLKByMrtg1U19910SMLjKxNkF8FjudA2SOZEj41b1l1hfsKGIU95uURDQoifdNS0WpX2RTgiC9dvTm4qLEeztBHPrM1Us9mVS3prYf/AIDAkxG+EdYAnw5YHryq5bvt3moljChdgMQvgBMeeTVc8QCWrFy5e2gCbhYqJ/lmd/lnMDrFTgLYg/ADDgPlry3BkiEDISnxCkRyzQ/AiWbKwbqsAelsKoZR7yDj1rE1vbi2m9Q5ch1ZCIhkbxQQFlUCxJyTmKXAe2ZvDddZLcXVB8X2TbLMACMKCJmZzFKia3mvJpXOzMz4bZP84+yvVpsjl0Xn+dIdm9obJSCu3Y7KSNq7pg/e3fCvK8T/ANpLglbKjDXBvcyCpbwEJAIIUYn4g0+Ff7SLu9e/VWRjDFVIK5GREzAztzPmOVVw46Kssl5NTiWmuIzbb1wKpHN2MDZuJyarWLxa13w1DlAGJcXG2wvtEmekH5VqdoNerWbly0/tFQjbTG42jtOVyOWYIrzacTvLomtm4j3izQwYLCkELtGwAkkEQduMziudRo6/JIvm5/L77+IbZE7+8OyPPdMVyt3GY711DEFAyxcPiBOCPFkHpVQ8RuLw4Frim4GMyFyN4Odw6IM4+teN1Ovd27wkZidpHkQBAwP9KKF9CWVrg+iIbxn+Y+BPtN5gefrXKxeuOpZbrYnqejbTz9azOz/GHNq9Pj22vDlfCRBO4xygbs+gqHZ7jLto9Q7vucK+w7ZAKqjySMASetTQqy8GsgvsGi4wgA8gebBevvqCPdZigvgsIDCEJE/eESPjXm9D2qvIQzENylQAAYIMNAJjAz6VtcD4qz6x3fu0tMQyttVSfGsKzTJIWeflV1q7J8tnUX75Yqt8EgwQEtkqfUbcfGqp1moJgXlPOfBaMECYPg54qHBOIuNY7OqhGu4ZVRcBmgsZlpHoSd0+dUNBqnDut1URiCwCKo3YYMSVkE8p61pKPRlzkazaN32u77vAD7FscwDA2pXG3p3IHhcT3MgFxG+e8wI9kf8AmrGo4tbtW03tDd2p2xJ9kRIrOt9rRIBGPBuMTH34Ez7vzq6svy+y3b0TMUDI5Be6GkuYVCwQ5OJge+ahpuGkmyXtAblc3JT2WEbRnlVvRcaZ3tLtEP3x5H2UYhIz7pp6TjBd7KECXttcaBygwAuffTUu5m2+HXO7sk24Y3P5nhA8G5ufkIC1M6B51HhMQO65fdM7fjHOrlvi7tbsOVWblwo3OAAWEj18IoPESTqBtH8r2eefCWz8RVow5My9Rw66bNkBTvDKbmRMfanOa66jh7nVo6r4Ap3GRE+OMdeYqxe4uy2rFzYJusgIkwu7y866X9eV1KWNoIdSd05Ebunwq0c7ZSt8Ncat7hXwFYBkc4Tpz6GtHU6bdbZRzKsB7yCK4pxEnUtp9ohU3bp/u4j/ABVev3diM/3VJ+QmpQt2Z/A+HNbtlHidxODIiBXseCaAtbJEe0efuFeW4Nr+/t79u3xERM8gD+de77N/8E/3z+C1JAzuN8Ae7Ye2m0MwABJxzBrH4N2Qv2rZVlUncTIOOQH5V7LjPERp7L3ipYIJ2gwTmIE1U7PccXV2jdVCoDFYJE4AM/Womy+D5HpC6XPAXUkkYJ9ORn1rbsajxgg/zFEbg6lxiDBLbhzPWq2j2qBLLLZGTj3SB51Oxw6dS2oRgRs8SiMHaoLbp/p+tcHK3yfRwYtYptd/SNccRvj7d7/Mp/7qt8Q46bVtDcuXk3AAMPFmAYO1p86y3vgGCR6ZGf3NcO0V+2LKW3JDHaVEeWCTHIQSJqRbbo75YQjG+PotabjVqHK6oqXfIhkYtG4sTIEGI3MeddbXaKybbBtTcaeuy6SB7isedfPNMgHezMBFmOf/ABrPL1ia9DwfVEqyC0GVgQGfGQCQJHIkqPkK7SxpHhjlu019I9ra4ghth1cspHVTyifZmeUmImm3EkwsgkiVUT4sxjz/AH5GvBJqkQrgs2yJLsrDaABAU4JAHSY5VYXjibtpREQqNhdSyh5BaSuQCCOcwVn1ryyxzbtWR5uT2lnXBsKDuAmDC55kZXlyyJrI4pxFHJ018sm4iNpifFjcwHskiOU+Y5TX0XEUulSCrlpAZTsdQQAD3bk7yOXhnIUchjE4pf07vbJ3m9sUbvAyyANveSxUtgjyzkVIRm5VKySyWuzSvcK0zAuXdfs7t64wYUDn0Jgx16CKxOLcNexJ9pAdu/CxzG1knHIHrMiqmj1apvTaxDEG222dj9MDbBEvykE+nO+5uaxQNyoFlnd3CpJPITBMQvLrkmSDXpjGcJcu1+TjKUWjHO5gSVHlujG4zgnkCf8AzXbT8OvNsIQ+PCSsB/D9mefv5Z516bSaNkBTej2zH8tkL22YGMh02kciCeUAj0z9Yb1lkuu4Zh4U2wu1cSFUAKBGOUZrr8q6XZhOJt6AlXRL4S2BbVQ7oXLOrAbdqMsYPM+Y5104tbe1dup3M20+1DhWbaGG2SepPXEVy0hcsl9riuFCn2FlgjFhuYDJz8CMRXPi3aY37qC2qJvCyzIlyWIESHXpIHz8q86/Udo56fbooarVNDI1pj4oAhubKTEef4zU+C9mUe5aL7mUruZZ5MGSFI5kAbpFdX0mocMhvJmZjTIhnOQ6gGRPnyotcOvKu3epyCCN6sIDA+y0nmvMxg/C7pKk6MyzRfdnp+Ja5LFpyCisFbu1AVTCj2UBHkQPLNZnZTiqPbIuOgcbgd5WST1UnpPSfxrJ1XDLjsSXZyQVXeBgsrLlgWbEjPxip3Oy7pbQv4pkDu3WQVOSXZBJz5fZ6RWlrryx8rfKXBmcR7Pf/wBG1H9sPclhkAHIBB8XP0rU2IlsKFLbF8R8OCqCBtjmc9fKkOHXA073bEAu5Ypz9iJgTFPVO6I9xrenkAmSrMeYPJ5BYwFkyeXKsyns0rN482NNsqfxaCZTxeAiIgiYBAjECKfFzba1uDJuQAqFuPv8ZG4Mndhes4cnNd9PcLoHNnTbGIYkKyMoxKrtgcx1z6jp14rqO77w2NNb7t0VXa4JddhkFSHmAAvrKitRcVL8iedSVJnkNe47zCwIXH+BZnrzk/Gq4c/vnWte0mofxm0PZgFSpx0IlvKumm0qbGDpucsCPHsCjacFHAkyDmeoxzr0qao89oo6fUAYYkQMQAc9B+/9NTR6Z3YFN0RAcSNskCOcgSelUNeioY2sqtDDcufXqTU7PG3QgSSoPKQMQZWY5Zn31zntJXE6Rm+jW/sy4CLYuEFfFbBJAnJ3AAkJOecdarNpNUN8Kx7xQXgzulTgkjJgEYrpp+KsEBUHAadxXdykbCzbokDljGMk1K3xVnTZAVgw2MX3sWwYKkExtmW6GI5weCeVejdxKmvt30RFcNsTY6EL4VjkC0DI5ZqD8Rc3BeYjeggSABBmcD0Y/I1ebjh2kFiu9TAiVByCOXiWZmRmOflg96GLEgKWk4ECCSY54GY+VdYOTX6kYk14NGxrrvfm8El2WPZbaR4eQGegre4g97uXEKZQqQqNuG4RME9JNePsXmDSrkGTlW2+H0jPTlWhrdbqFQfzrnilGlyG229hUT7WCxz7vKttO1TNRcdW2izwnjH8OndlC0sTM7YmBEQfKvedne069wT3be03Ig9Fr5P3jMZZmb3sT+New7NopsSVUnceY9FrOV6qzpgxxnKmizxvteb6vbgqhwvI5B5n4A/M/DO4X2hvWUKWmAXcSeXOAD+FUu0PD9j94igK3QfeySY8qyUYxVxqMlZzzRlCVH07ScICAm5sYgyvhAAEAQcAc58+dK6mmkOypgY8JAgkc1GD8RishXuBYuKxknxF3AXGMA+/oc/TOvWE2sxvBo5kGQCSAN2JGfTz8q8ycm+iPPJJUz0F9tL4WKee2FZVJ8twx6j3VV1/EdF4We0rMkAE7yBkGJJzy61m6fUOy+Nw6mI3BiIBwCrAA+lTv7duLFpveNg+gqbU6f0SX+Q3xbOqXtJdW5t06yVEFRsD+NSR4YzgGfSub6j+WVt2mVSpB3qwIgY+0WiIqjctXWnGzy2u5n5mKxdQmonK3cf1MRW1HZ/u6MLI6dMrNdYktJgGfn1/CrIck5GPveUA8hyBmOmfSqD2nDQVYE9CDJ64Hwq3otJeJICMPCxlhEEK22C3UmB8a9TqrIemXR6Ozp7dwXi9zduNveypbePEVKrBKmBHWa4arjC7F2shdWVhFsqZmMuSfsk/Kquj4fqHQLt37STsPjVdwWCqyApJ3TAzA8q6LpXEr3KD4eUdN2DiuEmrsklzyzjqRafYbbjeGli0gHBJcrgSIPL3etb+iRERVQeEAAQJ+JI/H31mJ3oiLKz5gqDn4Vwu3riKymw+089r++fsetcpXLi/szS9no1knaBJkGOvMHlXlO1d2bqLnwoPgWY/kBWpodGbttLlp1E81cu+1uTL4QZJ/ujFcdb2ca4QwKJJORuO/rITaCfOZmDyq4oxUrNVSVnbh2oC6JyWjD/AkGAPifrXlkcgIw5q0+vQiI+Nbev4O9nSPu8R3KZUkwgjmvTO4z0HvxPsZw7fcdnUbETezOGKLBndgHxQDHxrvGKim/bCXo9LbvFlUn7QHIGBInPkK5vqlBIJODHstEzHOt7ScF3oY1ZZTJXuhtIGIDMWbcR6gdMVCw72oRrLOFEBn3bjnBZ1WCeuABnlXm+NIscTfZ5riPE1S27I0uBCwDzJiQYgxzp8F4sDpUtO2UuOQWPMPDZJ5ndvJ94rS7dXrZ0G7Ztd3UJ4i2QTJ5CRtVvmK5f7Ndvd3gyBpZctGMHA+YzXRQiof9NaO6C7eUAGDnyBPSeYx9ayuPXlbTXAszjBESA6yR54zX0q/wAIsupQooBnl65/T5V5jU9hnJJXUl1P2HQKI8i6en9NZhCKdmNKPm765hp0tQRLFt04Ik+EY88860uJa/dpk8WXIDf4ef1A+dde2HDH0y2rbJbVZYqyMXLEBQ24kD0xH41U0fDGv2E7sLvVmklwJ9nG0/DP7HfSLqX5DVdm3wq7/JSSJ2j6eGug1A7wjmNi9JGWas+12du7FhrZYlgAWZc9FDhtpJ8iMetV7nANSxAuW3QHq1xSs88bVauMscVbbIop9GpqdHbdSIYT/USMeStIHyrC/sYtcdd+FzPViw3Acsepqvr9Ilo+25YYEHHunaPWuVniTp7JJ/vZ9K3CMkri7FNHXU8OZ2JtrICqY3AmWExmOldeGcE1N5HFvTM5SDOEKkZ5MRvkAiBJEfPhY4wU3eD2iWPi6wAAJGBirWl4k7SJYq8hgz8gFZ5XYy58JAmVyQa6XJcNcFWxiO3XlAA6dOp9aFc5PXy/fvq1q9MWYsgJGOZBMwOcH/T4VUFvIB6mOWf9a6ppo0drEloUSTyEZJ6QPOvR6vSrdt2md2QjejAKXeQLYyJE8s9RjnIrI0OhB8TZEnBMTHUwDitLUqrxNpDEkBCVEkLJ2gDJCr8q5SlzwVSpNHS52WAG5dSjdYKOvz2ho+VLRXrlhgjXkCKQSIJnxAkEFQTicYqslsj2Lbj0DuB8hRcuH7VpuRxM8xznaCY9SamzfD5CyV0b78es7Sz7XIONg2GCRBKmQSM9cjyqFjjOmIk24yeZWT64FYBu2gobu1fMHDWyDHL2mFWdNqtLtzZeZ++f1qax9M6/PP2aP8GJJZmYnnLHPnMc/jUl0yDkij3KKsTRBP7H5143KT7Z46FFNVIprZAJMsccixx/liuq49ayxRWuq0eCJ6gmPyNZd/8AiZgKCPSPzit4k/sUgK1GevhFMCxauNdW5ctwUBggiOvTd6zWuzHyru6AiDI9xIPzFQ7vEKx+Ofqc/Wkslksz9FdJW5LOgJ2lgSrQN3Izyx7vTrV+04gDvC58zzHLHn55geycDlSfSl123NrjEDkFAkxA9Wbr1pJokTIXPU5J+eTW3ki4tHSck0kvSJ6jVLbQvsDRzkmB5GBzExPpUrGoF23m2E6GJg4O6MnHIz6iDzrHfU2i+101UExhmVCOsjbMHOP2Lq37aRb2XAoAg5bHKeZEgdB8sZy8dJewnUaM9+CXUYvprhX+mSPhjmPQiotrtYhIuWSw6ldysfUm2RnHMir/APbaK0FG2yMsrcpycYx+tTPH9NBIV2g8iduM8jHPHLnn411Sn20n/ZNnRgpxG2sl0vKTAPjLAe4OPSMzWpw3tJYswtsXEG4N5j+oEFiDI6xjpV/+19M6h9phiVALSZABziZzGJqu2o0T7jsQKCss6gqN2OkHzg+mRW/9p/yLLL9pdOwBYAkLglWUjMxuXMA/nzqzY7TIIi6y9YL3tkxBHoPnHkazb1nQbiAssOYVQQFz4t4MDkcHI65xUV4XoyPA8nMqGcHpIyeefp8KjSXdl2aNfW2bvErbWrLo+whzuaWUywBUtBE8vgfOtTs/wbUaHSvvUbi29iHXaJhQPhAk/wBXIxVHsc1nTXmO7YjrtZmbHhllkn4/Ot/jfHLLoFt394JhwpB8MH8CFPw9a1FxcOxu+zHbtZiBdtA4z3yN7+Tcvl+nI9ptoIFxD9pTvLz0wQp8PxP6YD8CDIBvsCQCPFBEAROMdMVz0uk0wtqjPudJVoYhSVcjw5kmDgBTOKPHStMrkzR4rxGxftlLrsdxDQofapAjAJiYP05eWfotXZtDarO6R7O2ADmWBJxPzEDMCqwezG4WfCMe2zEkEGRu58xj0xyNW1uWQ2UA68x1iCOUj6nnUaklXJGd7PFAW3oj9BtkFQQPumf2MRiur6t3AkxEYAjAM7R6RPzpW7iMfAGbmTyECY+0fEZjl9eVVLro0lL5QdB3anImVkxHQ9fwnk4OT6Js10dbWq0bkW2RwzTghWyT5/Hy6VQ1mltKTCKRJjpieeMV1s9yrG6zuzQROwKZHQgYLemOvoa6rqlZoUqeZHiAkDyInOeWPdV1lB2roSdrhGA9tW9hFUcvEdxPzxXIrcSDyxuXAiY5+XU1s3uHIW3LuUzPhIInzAbAOajprey4N6u6AMIIUc4iCvunNd1ljRYyRzt8StkQ5EkZkGKaaFGuhlUbdhYgdSGVen95flVzuUj2V+Kj9KkiAGQFHqAK4bpdWjNkF0Fr7i/KuqaJFIKooIyIUT8DUwfd+/jUg1c9n7IBQ1B7EjIn3gV33GuFzW7Wgqx9Yx8+tI7XwSjmulgQsAeURmq9xQDHcOfWB+lX7d9XEiY5ZUj8RUwB+zW92uzSbR2L0Kf3inRXFkAimFNFFQAT60pooqBklPvrrI6znzoooAUDp+/lUt9FFC+BPdAGSBXI6pAImT5xzooqoyyPeo2PyoNtaKKBA1tPuj5VHu0+6KKKlsMi2mQ/YXHLFIadRkKPWB+NFFXZlJm1yMcvWc/s1a0OkW7cS3y3MBMzGMxMxRRWsbeyCON/h1rcVa0pKkr7A6Egny86rHhdhTIWPdj8KKKu0r7KyA4Vp/ufU/rSPDbUEbMYMbmiRMYnnk0qKm8vZBLwuyPsfUx8vgKZ4XYj2F+v60UU3l7AHQafltT48/nXW3okU+AKPcM/OiirJy9g6mzUDaH+lFFcwQawPWoFR606K0gQ7sU+6pUVQGylBooqgRJphjRRWyn/2Q==";

    private String fullNews = """
            The Supreme Court on Wednesday proposed a panel of domain
            experts to inspect the closed Sterlite copper unit in Tamil Nadu’s Tuticorin and suggest further compliances and
            way forward, saying shutting down a plant of “national importance” will not serve anybody’s purpose.

            The plant is closed since May 2018 after 13 people were killed as police opened fire to quell a protest over
            alleged pollution caused by it.

            The top court, while hearing a plea by the Vedanta group company, mooted the idea of setting up of a panel of
            experts and sought views of the firm, the Tamil Nadu government and the state pollution control board.
            “Ultimately, shutting down the plant of national importance will not serve anybody’s purpose,” a bench
            comprising Chief Justice DY Chandrachud and Justices J B Pardiwala and Manoj Misra observed.

            The bench, however, made it clear that it cannot grant permission to the firm to “refurbish” the plant as an
            interim order.

            The bench, which heard the submissions of senior advocate Shyam Divan on behalf of the Vedanta group firm, said
            since the matter pertains to the state’s public interest, private interest of an industry, and employment of
            several people, a way forward has to be found out.
            “So how do we find a way forward? You know, we have to find some way forward and why look at the negatives. The
            easiest thing in the world for them and for us is to shut down a plant… You (Tamil Nadu and state pollution
            control board TNPCB) also explore what should be the best modalities to subserve the public interest,” the bench
            said.

            “Come back tomorrow so that we can then do something… And rest assured that any stringent condition that you
            (Tamil Nadu) want us to put, we are more than willing to put in that order, which protects interests of both
            sides. The community must have the confidence,” the CJI said.
            “You are shutting down an industry. We are not a banana republic. We are governed by the rule of law. They
            (firm) may be the violators, but you have to follow fairness in your approach,” the CJI said.

            Senior advocates CS Vaidyanathan and Gopal Sankaranaranayan, who appeared for the state government and the
            TNPCB, said the violations were writ large and and even one of the several grounds was sufficient for ordering
            closure of the copper unit.

            The state and its pollution board referred to alleged violations including that the firm failed to furnish the
            ground water analysis report and did not remove copper slag dumped alongside a river.

            The firm, on the other hand, said no specific material violations were alleged and it was claimed that the
            company did not file one report or another.
                """;

    public String getNewsHeading() {
        return newsHeading;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    public String getFullNews() {
        return fullNews;
    }

    public void setFullNews(String fullNews) {
        this.fullNews = fullNews;
    }

    public void setNewsHeading(String newsHeading) {
        this.newsHeading = newsHeading;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<News> getAllStudent() {
        List<News> news = List.of(new News(id, clicks, newsHeading + " 1 ", timing, writer, image, fullNews), new News(id+1, clicks+1, newsHeading+" 2 ", timing, writer, image, fullNews), new News(id+3, clicks+2, newsHeading+" 3 ", timing, writer, image, fullNews));

        return news;
    }

    public News getNewsById(int id) {
        List<News> li = this.getAllStudent();
        for (News news : li) {
            if (news.getId() == id ) {
                News user = new News(news.getId(), news.getClicks(),news.getNewsHeading(), news.getTiming(), news.getWriter(), news.getImage(), news.getFullNews());
                return user;
            }
        }
        return null;
    }

}
