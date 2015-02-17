(ns angsrc.beaver-data)

;; record field accessors for beaver datasets
(def beaver-day #(nth % 0))
(def beaver-time #(nth % 1))
(def beaver-temperature #(nth % 2))
(def beaver-activity #(nth % 3))

(def beaver1 
  "beaver1 from R datasets"
  [[346 840 36.33 0]
   [346 850 36.34 0]
   [346 900 36.35 0]
   [346 910 36.42 0]
   [346 920 36.55 0]
   [346 930 36.69 0]
   [346 940 36.71 0]
   [346 950 36.75 0]
   [346 1000 36.81 0]
   [346 1010 36.88 0]
   [346 1020 36.89 0]
   [346 1030 36.91 0]
   [346 1040 36.85 0]
   [346 1050 36.89 0]
   [346 1100 36.89 0]
   [346 1110 36.67 0]
   [346 1120 36.5 0]
   [346 1130 36.74 0]
   [346 1140 36.77 0]
   [346 1150 36.76 0]
   [346 1200 36.78 0]
   [346 1210 36.82 0]
   [346 1220 36.89 0]
   [346 1230 36.99 0]
   [346 1240 36.92 0]
   [346 1250 36.99 0]
   [346 1300 36.89 0]
   [346 1310 36.94 0]
   [346 1320 36.92 0]
   [346 1330 36.97 0]
   [346 1340 36.91 0]
   [346 1350 36.79 0]
   [346 1400 36.77 0]
   [346 1410 36.69 0]
   [346 1420 36.62 0]
   [346 1430 36.54 0]
   [346 1440 36.55 0]
   [346 1450 36.67 0]
   [346 1500 36.69 0]
   [346 1510 36.62 0]
   [346 1520 36.64 0]
   [346 1530 36.59 0]
   [346 1540 36.65 0]
   [346 1550 36.75 0]
   [346 1600 36.8 0]
   [346 1610 36.81 0]
   [346 1620 36.87 0]
   [346 1630 36.87 0]
   [346 1640 36.89 0]
   [346 1650 36.94 0]
   [346 1700 36.98 0]
   [346 1710 36.95 0]
   [346 1720 37 0]
   [346 1730 37.07 1]
   [346 1740 37.05 0]
   [346 1750 37 0]
   [346 1800 36.95 0]
   [346 1810 37 0]
   [346 1820 36.94 0]
   [346 1830 36.88 0]
   [346 1840 36.93 0]
   [346 1850 36.98 0]
   [346 1900 36.97 0]
   [346 1910 36.85 0]
   [346 1920 36.92 0]
   [346 1930 36.99 0]
   [346 1940 37.01 0]
   [346 1950 37.1 1]
   [346 2000 37.09 0]
   [346 2010 37.02 0]
   [346 2020 36.96 0]
   [346 2030 36.84 0]
   [346 2040 36.87 0]
   [346 2050 36.85 0]
   [346 2100 36.85 0]
   [346 2110 36.87 0]
   [346 2120 36.89 0]
   [346 2130 36.86 0]
   [346 2140 36.91 0]
   [346 2150 37.53 1]
   [346 2200 37.23 0]
   [346 2210 37.2 0]
   [346 2230 37.25 1]
   [346 2240 37.2 0]
   [346 2250 37.21 0]
   [346 2300 37.24 1]
   [346 2310 37.1 0]
   [346 2320 37.2 0]
   [346 2330 37.18 0]
   [346 2340 36.93 0]
   [346 2350 36.83 0]
   [347 0 36.93 0]
   [347 10 36.83 0]
   [347 20 36.8 0]
   [347 30 36.75 0]
   [347 40 36.71 0]
   [347 50 36.73 0]
   [347 100 36.75 0]
   [347 110 36.72 0]
   [347 120 36.76 0]
   [347 130 36.7 0]
   [347 140 36.82 0]
   [347 150 36.88 0]
   [347 200 36.94 0]
   [347 210 36.79 0]
   [347 220 36.78 0]
   [347 230 36.8 0]
   [347 240 36.82 0]
   [347 250 36.84 0]
   [347 300 36.86 0]
   [347 310 36.88 0]
   [347 320 36.93 0]
   [347 330 36.97 0]
   [347 340 37.15 1]])

(def beaver2
  "beaver2 from R datasets"
  [[307 930 36.58 0]
   [307 940 36.73 0]
   [307 950 36.93 0]
   [307 1000 37.15 0]
   [307 1010 37.23 0]
   [307 1020 37.24 0]
   [307 1030 37.24 0]
   [307 1040 36.9 0]
   [307 1050 36.95 0]
   [307 1100 36.89 0]
   [307 1110 36.95 0]
   [307 1120 37 0]
   [307 1130 36.9 0]
   [307 1140 36.99 0]
   [307 1150 36.99 0]
   [307 1200 37.01 0]
   [307 1210 37.04 0]
   [307 1220 37.04 0]
   [307 1230 37.14 0]
   [307 1240 37.07 0]
   [307 1250 36.98 0]
   [307 1300 37.01 0]
   [307 1310 36.97 0]
   [307 1320 36.97 0]
   [307 1330 37.12 0]
   [307 1340 37.13 0]
   [307 1350 37.14 0]
   [307 1400 37.15 0]
   [307 1410 37.17 0]
   [307 1420 37.12 0]
   [307 1430 37.12 0]
   [307 1440 37.17 0]
   [307 1450 37.28 0]
   [307 1500 37.28 0]
   [307 1510 37.44 0]
   [307 1520 37.51 0]
   [307 1530 37.64 0]
   [307 1540 37.51 0]
   [307 1550 37.98 1]
   [307 1600 38.02 1]
   [307 1610 38 1]
   [307 1620 38.24 1]
   [307 1630 38.1 1]
   [307 1640 38.24 1]
   [307 1650 38.11 1]
   [307 1700 38.02 1]
   [307 1710 38.11 1]
   [307 1720 38.01 1]
   [307 1730 37.91 1]
   [307 1740 37.96 1]
   [307 1750 38.03 1]
   [307 1800 38.17 1]
   [307 1810 38.19 1]
   [307 1820 38.18 1]
   [307 1830 38.15 1]
   [307 1840 38.04 1]
   [307 1850 37.96 1]
   [307 1900 37.84 1]
   [307 1910 37.83 1]
   [307 1920 37.84 1]
   [307 1930 37.74 1]
   [307 1940 37.76 1]
   [307 1950 37.76 1]
   [307 2000 37.64 1]
   [307 2010 37.63 1]
   [307 2020 38.06 1]
   [307 2030 38.19 1]
   [307 2040 38.35 1]
   [307 2050 38.25 1]
   [307 2100 37.86 1]
   [307 2110 37.95 1]
   [307 2120 37.95 1]
   [307 2130 37.76 1]
   [307 2140 37.6 1]
   [307 2150 37.89 1]
   [307 2200 37.86 1]
   [307 2210 37.71 1]
   [307 2220 37.78 1]
   [307 2230 37.82 1]
   [307 2240 37.76 1]
   [307 2250 37.81 1]
   [307 2300 37.84 1]
   [307 2310 38.01 1]
   [307 2320 38.1 1]
   [307 2330 38.15 1]
   [307 2340 37.92 1]
   [307 2350 37.64 1]
   [308 0 37.7 1]
   [308 10 37.46 1]
   [308 20 37.41 1]
   [308 30 37.46 1]
   [308 40 37.56 1]
   [308 50 37.55 1]
   [308 100 37.75 1]
   [308 110 37.76 1]
   [308 120 37.73 1]
   [308 130 37.77 1]
   [308 140 38.01 1]
   [308 150 38.04 1]
   [308 200 38.07 1]])